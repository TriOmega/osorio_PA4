/*Create a separate class called Application that contains a main method which illustrates the use of DuplicateRemover
by calling both the remove and write methods. Your input file must be called problem1.txt and your output file must
be called unique_words.txt. You will not receive credit if you use different file names, as my graders will not
modify your code to make it work with their test files. */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        DuplicateRemover duplicateRemover = new DuplicateRemover();
        FileInputStream fileInStream = null;
        FileOutputStream fileOutStream = null;

        try {
            fileInStream = new FileInputStream("problem1.txt");
            fileOutStream = new FileOutputStream("unique_word.txt");

            duplicateRemover.remove(fileInStream);
            duplicateRemover.write(fileOutStream);
        } catch (IOException excpt) {
            System.out.println("Error IOException Occured: " + excpt.getMessage());
        } finally {
            if (fileInStream != null) {
                fileInStream.close();
            }
            if (fileOutStream != null) {
                fileOutStream.close();
            }
        }
    }
}
