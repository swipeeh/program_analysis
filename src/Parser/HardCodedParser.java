package Parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import AST.TracerProgram;
import AST.declaration.*;
import AST.statements.*;
import AST.expressions.lexpressions.*;
import AST.expressions.arrayExpressions.*;
import AST.expressions.booleanExpressions.*;


public class HardCodedParser {

    public static void main(String[] args) {


        // Read test file
        try {
            File myObj = new File("src/test.microc");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                // For each line of the file, split it into tokens
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        //Hard Coded HardCodedParser

        //int [3] a;
        Declaration decL1 = new ArrayDec("a", 3);

        //int x
        Declaration decL2 = new IntegerDec("x");
        Declaration decL = new DoubleDec(decL1, decL2);

        //x := 0
        lExpressions expL3 = new lVarOperator("x");
        aExpressions expL31 = new aValOperator(0);
        Statements stateL3 = new AssignmentEvent(expL3, expL31);

        //x > 3
        aExpressions expL4 = new aVarOperator("x");
        aExpressions expL41 = new aValOperator(3);
        bExpressions expL42 = new relOperator(expL4, expL41,">");

        // a[x] := 1
        aExpressions expL5 = new aVarOperator("x");
        lExpressions expL51 = new lArrOperator(expL5,"a");
        aExpressions expL52 = new aValOperator(1);
        Statements stateL5 = new AssignmentEvent(expL51, expL52);

        // x == 2
        aExpressions expL6 = new aVarOperator("x");
        aExpressions expL61 = new aValOperator(2);
        bExpressions expL62 = new relOperator(expL6, expL61, "==");

        // a[x] := 3
        aExpressions expL7 = new aVarOperator("x");
        lExpressions expL71 = new lArrOperator(expL7,"a");
        aExpressions expL72 = new aValOperator(3);
        Statements stateL7 = new AssignmentEvent(expL71, expL72);

        //If x==2 then a[x] := 3
        Statements stateL6 = new IfStatements(expL62, stateL7);

        // a[x] := 1
        // If x==2 then a[x] := 3
        Statements stateL5L6 = new DoubleStatements(stateL5, stateL6);

        //While x> 3 then
        // a[x] := 1
        // If x==2 then a[x] := 3
        Statements stateL4 = new WhileStatements(expL42, stateL5L6);

        //x := 5
        lExpressions expL8 = new lVarOperator("x");
        aExpressions expL81 = new aValOperator(5);
        Statements stateL8 = new AssignmentEvent(expL8, expL81);

        //While x> 3 then
        // a[x] := 1
        // If x==2 then a[x] := 3 end if
        // end while
        // x := 5
        Statements stateL4L8 = new DoubleStatements(stateL4, stateL8);

        //x := 0
        //While x> 3 then
        // a[x] := 1
        // If x==2 then a[x] := 3 end if
        // end while
        // x := 5
        Statements state1 = new DoubleStatements(stateL3, stateL4L8);

        TracerProgram testProgram = new TracerProgram(decL, state1);







    }

}
