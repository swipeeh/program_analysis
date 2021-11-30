package graphConstruction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import AbstractSyntaxTree.*;


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
        declarationInterface decL1 = new arrDeclaration("a", 3);

        //int x
        declarationInterface decL2 = new intDeclaration("x");
        declarationInterface decL = new doubleDeclaration(decL1, decL2);

        //x := 0
        lstExpression expL3 = new lstVarExpression("x");
        arrExpression expL31 = new arrValExpression(0);
        statementInterface stateL3 = new assignmentStatement(expL3, expL31);

        //x > 3
        arrExpression expL4 = new arrVarExpression("x");
        arrExpression expL41 = new arrValExpression(3);
        boolExpression expL42 = new boolRelationsExpression(expL4, expL41,">");

        // a[x] := 1
        arrExpression expL5 = new arrVarExpression("x");
        lstExpression expL51 = new lstArrayExpression(expL5,"a");
        arrExpression expL52 = new arrValExpression(1);
        statementInterface stateL5 = new assignmentStatement(expL51, expL52);

        // x == 2
        arrExpression expL6 = new arrVarExpression("x");
        arrExpression expL61 = new arrValExpression(2);
        boolExpression expL62 = new boolRelationsExpression(expL6, expL61, "==");

        // a[x] := 3
        arrExpression expL7 = new arrVarExpression("x");
        lstExpression expL71 = new lstArrayExpression(expL7,"a");
        arrExpression expL72 = new arrValExpression(3);
        statementInterface stateL7 = new assignmentStatement(expL71, expL72);

        //If x==2 then a[x] := 3
        statementInterface stateL6 = new ifStatement(expL62, stateL7);

        // a[x] := 1
        // If x==2 then a[x] := 3
        statementInterface stateL5L6 = new doubleStatement(stateL5, stateL6);

        //While x> 3 then
        // a[x] := 1
        // If x==2 then a[x] := 3
        statementInterface stateL4 = new whileStatement(expL42, stateL5L6);

        //x := 5
        lstExpression expL8 = new lstVarExpression("x");
        arrExpression expL81 = new arrValExpression(5);
        statementInterface stateL8 = new assignmentStatement(expL8, expL81);

        //While x> 3 then
        // a[x] := 1
        // If x==2 then a[x] := 3 end if
        // end while
        // x := 5
        statementInterface stateL4L8 = new doubleStatement(stateL4, stateL8);

        //x := 0
        //While x> 3 then
        // a[x] := 1
        // If x==2 then a[x] := 3 end if
        // end while
        // x := 5
        statementInterface state1 = new doubleStatement(stateL3, stateL4L8);

        Tracer testProgram = new Tracer(decL, state1);







    }

}
