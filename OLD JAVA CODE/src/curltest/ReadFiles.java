
package curltest;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ReadFiles {
        String fileName, line;
        FileReader fileReader;
        LoadFeatures Loader = new LoadFeatures();
     public ReadFiles(String file){
         fileName = file;
         try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
                System.out.println("Successful read of " + fileName);
            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
     }//end ReadFile()
     //////////////////READ IN BASE FEATURES///////////////
     void ReadBaseFeatures(){
         
         String file = "BaseFeatures.txt";
         try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(file);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
                System.out.println("Successful read of " + file);
                
            while((line = bufferedReader.readLine()) != null) {
                //System.out.println("***** " + line);
                Loader.LoadData(line);
            } 
            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                file + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + file + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
     }//end ReadFile()
     ///////////////////////READ IN BASE FEATURES////////////////////
     public void printFile(){
         try {
            // FileReader reads text files in the default encoding.
            fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
     }
     public void find() throws IOException{
         Scanner scan = new Scanner(System.in);
         System.out.println("");
         System.out.println("What would you like to find?");
         System.out.println("-------------------------");
         System.out.println("1 -- IPA Character Data");
         System.out.println("3 -- letters around a specific letter");
         System.out.println("-------------------------");
         System.out.println("");
      
         int inputFind = scan.nextInt();
         //scan.close();
         String input = "";
         switch(inputFind){
             case 1:
                 System.out.println("Please input a character to be searched for:");
                 Loader.ValueSEARCH(scan.next());
                 break;
             case 2:
                 break;
             case 3:
                 System.out.println("Enter a letter");
                 System.out.print(">>>");
                 Scanner scan2 = new Scanner(System.in);
                 input = scan2.nextLine();
                 System.out.println("Looking...");
                 break;
             default:
                 
                 break;
        }
         if(inputFind == 3){
         try {
            // FileReader reads text files in the default encoding.
            fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
               int lineCounter = 1;
               int counter = 0;
            while((line = bufferedReader.readLine()) != null) {
                
                Pattern p = Pattern.compile("(\\w|\\s|\\W)("+input+")(\\w|\\s|\\W)");
                Matcher m = p.matcher(line);
                if(m.find()){
                    String Before = line.replaceAll(input + "(\\w+|\\s)", "");
                    if(Before.length()>1){
                        Before = Before.substring(Before.length()-1);
                    }else if(Before.equals("")){
                        Before = "#";
                    }
                    
                    String After = line.replaceAll("(\\w+|\\s)" + input, "");
                    if(After.length()>1){
                        After = After.substring(0,1);
                    }else if(After.equals("")){
                        After = "#";
                    }
                    System.out.println("Line "+lineCounter+++" -->  before: " + Before + " after: " + After);
                    counter++;
                }else{
                lineCounter++;
                }
            }   
            System.out.println("*" +counter + " results*");
            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
                
     }
     }
     

        
   
}
