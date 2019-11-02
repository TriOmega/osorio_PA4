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
