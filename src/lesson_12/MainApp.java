package lesson_12;

import java.io.*;
import java.util.Random;

public class MainApp {
    public static final String RESOURCE = "src/lesson_12/resource/";

    public static void WriteFileWithByteArray() {
        try {
            FileOutputStream fos = new FileOutputStream(RESOURCE + "new.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write("Agil".getBytes());
            bos.close();
            fos.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static void WriteFileWithRandomByteArray() {
        Random rand = new Random();

        byte[] arr = new byte[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (byte) rand.nextInt(100);
        }

        try {
            FileOutputStream fos = new FileOutputStream(RESOURCE + "new.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write(arr);
            bos.close();
            fos.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static void ReadFileWithByteArray() {
        try {
            FileInputStream fis = new FileInputStream(RESOURCE + "new.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            String text = new String(bis.readAllBytes());
            System.out.println(text);
            fis.close();
            bis.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }


    public static void main(String[] args) {
        WriteFileWithByteArray();
        WriteFileWithRandomByteArray();
        ReadFileWithByteArray();
    }
}
