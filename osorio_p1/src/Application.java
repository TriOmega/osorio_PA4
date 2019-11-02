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
