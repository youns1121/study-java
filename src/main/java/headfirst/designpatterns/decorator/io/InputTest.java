package headfirst.designpatterns.decorator.io;

import java.io.*;

public class InputTest {
    public static void main(String[] args) throws FileNotFoundException {
        int c;

        try {
            InputStream in =
                    new LowerCaseInputStream(
                        new BufferedInputStream(
                            new FileInputStream("C:\\Users\\minys\\Downloads\\test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
