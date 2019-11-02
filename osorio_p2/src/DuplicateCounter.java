import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {
    Map<String, Integer> wordCounter = new HashMap<String, Integer>();
    PrintWriter outFS = null;
    Scanner inFS = null;

    public void count(FileInputStream dataFile) {
        inFS = new Scanner(dataFile);
        String nextInput = "";
        int wordIteration = 0;

        while(inFS.hasNext()) {
            wordIteration = 1;
            nextInput = inFS.next();
            if(wordCounter.containsKey(nextInput)) {
                wordIteration = (wordCounter.get(nextInput) + 1);
            }
            wordCounter.put(nextInput, wordIteration);
        }
    }

    public void write(FileOutputStream outputFile) {
        outFS = new PrintWriter(outputFile);
            outFS.print(wordCounter);
        outFS.flush();
    }
}
