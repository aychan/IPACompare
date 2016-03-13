/**
    Welcome to the IPACompare application main class!
    If you are a contributer, please refrain from committing until 
    your code is well debugged and tested within your java IDE.
    Notice that this application is currently being made within NetBeans IDE 8.1,
    so there is potential for IDE crossover hazards due to manifest.xml files.abstract 

    Lets make cool stuff!
**/
package applicationipa;

public class ApplicationIPA {

    
    public static void main(String[] args) {
        MainGUI GUI = new MainGUI(); //create GUI object
        GUI.setVisible(true);        //Set GUI visible
    }
    
}
