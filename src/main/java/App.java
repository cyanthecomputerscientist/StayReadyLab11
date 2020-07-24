
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class App 
{
    //allow user to select a local text file for spell checking
    // display the incorrect spellings and suggested possibilities
    public static HashSet<String> fileToCheck = new HashSet<String>();
    public static HashSet<String> spellCheck = new HashSet<String>();

    public static String parse(String input)
    {
        String noPunct = "";
        String lowercase = "";
        noPunct = input.replaceAll("\\p{Punct}", "");
        lowercase= noPunct.toLowerCase();
        return lowercase;
    }
    public static String [] arrayParse(String [] arry)
    {
        String [] parsearry = new String[arry.length];
        for(int i = 0; i< arry.length; i++)
        {
            parsearry[i]= parse(arry[i]) + " ";
        }

        return parsearry;
    }
    public static String arraytoString(String [] arry)
    {
        String toString = "";
        for (int i = 0; i < arry.length; i++) 
        {
            toString = toString + arry[i];
        }
        return toString;
    }

    public static HashSet<String> readInFile(String pathname)
    {
        HashSet<String> hashSet = new HashSet<String>();
        String [] words;
        String [] parseWords;
        String word;
        try {
            File file = new File(pathname);
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine())
            {
                String nextLine = scan.nextLine();
                 words = nextLine.split(" "); 
                 parseWords= arrayParse(words);
                 word = " " +arraytoString(parseWords) + " ";
                 hashSet.add(word);
                 
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        
        return hashSet;
    }



    public static void main(String[] args)
    {

        String pathname = "C:/Users/Dominique/Documents/Dev/StayReadyLab11/letter_from_gandhi.txt";
        fileToCheck = readInFile(pathname);
        //System.out.println(fileToCheck);

        //get file from user (check)
        //turn file into hash set (check)
        String pathname1 = "C:/Users/Dominique/Documents/Dev/StayReadyLab11/words_alpha.txt";
        spellCheck = readInFile(pathname1);

        SpellChecker spellChecker = new SpellChecker();
        TreeSet<String> tree = spellChecker.spellCheck(fileToCheck);
        System.out.println(tree);
    


    }
}