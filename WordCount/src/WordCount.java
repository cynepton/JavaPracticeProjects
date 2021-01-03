import java.io.File;
import java.util.Scanner;

/**
 * Read a txt file and count the number of words in it
 */
public class WordCount {
    /**
     * Main function
     * @param args Nothing for now
     * @throws Exception This function could throw an exception
     */
    public static void main(String[] args) throws Exception {
        // Initialise file object
        File fileObject = new File("oliver-twist.txt");

        // pass file object to scanner so it can scan for a file
        Scanner fileScanner = new Scanner(fileObject);

        int wordCount = 0;
        // Read the file line by line
        while (fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            wordCount += line.split(" ").length;
        }

        // Print the file's word count
        System.out.println("The word count is " + wordCount + " words");
    }
}
