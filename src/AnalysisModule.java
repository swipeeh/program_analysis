import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AnalysisModule {

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





    }

}
