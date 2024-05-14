package lesson_11;

import java.io.*;

public class MainApp {

    public static final String RESOURCE = "src/lesson_11/resource/";

    public static void WriteFile(File file, String text) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(text);
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String ReadFile(File file) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            StringBuilder text = new StringBuilder();

            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                text.append(line);
            }

            bufferedReader.close();
            fileReader.close();

            return text.toString();

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    public static void main(String[] args) {

        File file = new File(RESOURCE + "hello.txt");
        WriteFile(file, "Hello java !!!");
        String fileContent = ReadFile(file);

        System.out.println(fileContent);
    }
}
