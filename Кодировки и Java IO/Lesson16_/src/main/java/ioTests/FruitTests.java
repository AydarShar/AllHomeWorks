package ioTests;

import ioTests.models.Apple;
import ioTests.models.Banana;
import ioTests.models.Box;
import ioTests.models.Orange;

import java.io.*;
import java.util.Arrays;

public class FruitTests {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Box box = new Box("Вася", Arrays.asList(
                new Apple(),
                new Banana(),
                new Orange()));

        File file = new File("src/main/resources/task4.txt");
        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(box);
        objectOutputStream.close();

        FileInputStream inputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Box box1 = (Box)objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(box1);
    }
}
