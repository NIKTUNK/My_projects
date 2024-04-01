import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Rnew
{
    public static void main(String[] args)  {
        StringBuilder str = new StringBuilder();
        String filePath = "input.txt";
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                str.append(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        String[] d = str.toString().split(" ");
        int a = Integer.parseInt(d[0]);
        int b = Integer.parseInt(d[1]);
        int c = a+b;
        FileWriter writer = null;
        String filePath2 = "output.txt";
        try {
            writer = new FileWriter(filePath2);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            writer.write("" + c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}