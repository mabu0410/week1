package practice.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNames {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            File file = new File("src/practice/file/names.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
        }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file.");
        }
    }
}
