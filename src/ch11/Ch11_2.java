package src.ch11;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ch11_2 {
    public static void main(String[] args) {
        String data = "Hello World!";
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\myong\\Desktop\\output.txt");
            fos.write(data.getBytes());

            System.out.println("Writing completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
