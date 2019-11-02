import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        DuplicateCounter duplicateCounter = new DuplicateCounter();
        FileInputStream fileInStream = null;
        FileOutputStream fileOutStream = null;

        try {
            fileInStream = new FileInputStream("problem2.txt");
            fileOutStream = new FileOutputStream("unique_word_counts.txt");

            duplicateCounter.count(fileInStream);
            duplicateCounter.write(fileOutStream);
        } catch (IOException excpt) {
            System.out.println("Error IOException Occurred: " + excpt.getMessage());
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
