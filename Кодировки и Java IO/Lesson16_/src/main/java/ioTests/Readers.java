package ioTests;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class Readers {
    public static void main(String[] args) throws IOException {

        // Задание 1.
        System.out.println("Задание 1: ");

        String readFile = "src/main/resources/readFile.txt";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(readFile)))) {
            System.out.println(reader.readLine());
        } catch (FileNotFoundException ex) {

        } catch (IOException e) {
            e.printStackTrace();
        }


        // Задание 2.
        System.out.println("Задание 2: ");

        InputStreamReader in = new InputStreamReader(new FileInputStream(readFile));
        while (in.ready())
            System.out.print((char) in.read());
            System.out.println("");


        // Задание 3.
        System.out.println("Задание 3.");

        String encodingFile = "src/main/resources/encodingFile.txt";
        Path path = Paths.get(encodingFile);
        String s = Files.readString(path, StandardCharsets.UTF_8);
        System.out.println(s);

    }
}
