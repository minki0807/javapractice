package src.ch11;

import java.io.*;

public class Ch11_selfcheck {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\myong\\Desktop\\input.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\myong\\Desktop\\output.txt")))

        {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("File copy completed.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
