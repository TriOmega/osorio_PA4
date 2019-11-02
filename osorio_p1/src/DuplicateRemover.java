/*Create a class called DuplicateRemover.

Create an instance method called remove that takes a single parameter called dataFile (representing the path to a text file)
and uses a Set of Strings to eliminate duplicate words from dataFile. The unique words should be stored in an instance variable
called uniqueWords.

Create an instance method called write that takes a single parameter called outputFile (representing the path to a text file)
and writes the words contained in uniqueWords to the file pointed to by outputFile. The output file should be overwritten if
it already exists, and created if it does not exist.

Your program should work on any text file. The TA's will provide their own version of problem1.txt when they run your code. */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;
import java.io.PrintWriter;

public class DuplicateRemover {
    Set<String> uniqueWords = new TreeSet<String>();
    Scanner inFS = null;
    PrintWriter outFS = null;
//    Paths dataFile = Paths.get("C:\\Users\\ericd\\OneDrive\\Desktop\\problem1.txt");

    public void remove (FileInputStream dataFile) {
        inFS = new Scanner(dataFile);
        while(inFS.hasNext()){
            uniqueWords.add(inFS.next());
        }
    }

    public void write (FileOutputStream outputFile) {
        outFS = new PrintWriter(outputFile);
        for(String currUniqueWord : uniqueWords) {
            outFS.print(currUniqueWord + " ");
        }
        outFS.flush();
    }
}
