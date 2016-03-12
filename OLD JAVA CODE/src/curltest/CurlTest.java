
package curltest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Anthony
 */
public class CurlTest {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input a Text File Name");
        String input1 = input.next();
        System.out.println("You inputed: " + input1);
        ReadFiles reader = new ReadFiles(input1);
        reader.ReadBaseFeatures();
        
        while(true){
            //////menu//////
            
            
            System.out.println();
            System.out.println("-----------------------");
            System.out.println("Select an operation:");
            System.out.println(" -   -   -   -   -   - ");
            System.out.println("'Exit' - exit program");
            System.out.println("'Print' - print contents of file");
            System.out.println("'Find' - find item in file");
            System.out.println("-----------------------");
            System.out.println();
            String input2 = input.next();
            
            /////menu//////
            
            switch(input2.toLowerCase()){
                    
                case "print":
                    reader.printFile();
                    break;
                case "find":
//                    
                    reader.find();
                    
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("error with user input.");
                    break;
            }
            
        }
        
        


    }
    
  
    
}
