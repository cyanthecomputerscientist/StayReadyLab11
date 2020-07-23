import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class App 
{
    //allow user to select a local text file for spell checking
    // display the incorrect spellings and suggested possibilities
    public static HashSet<String> fileToCheck = new HashSet<String>();
    public static void main(String[] args)
    {

        String pathname = "C:/Users/Dominique/Documents/Dev/StayReadyLab11/letter_from_gandhi.txt";
        try {
            File file = new File(pathname);
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                fileToCheck.add(scan.nextLine());
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        System.out.println(fileToCheck);
        //get file from user (check)
        //turn file into hash set (check)
    }
    
}