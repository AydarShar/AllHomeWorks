package ioTests;

import ioTests.models.*;

import java.io.*;
import java.util.Arrays;

public class AnotherOneFruitTests {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Box2 box2 = new Box2("Вася", Arrays.asList(
                new Apple(),
                new Banana(),
                new Orange()));

        File file = new File("src/main/resources/task5.txt");
        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(box2);
        objectOutputStream.close();

        FileInputStream inputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Box2 box3 = (Box2) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(box3);
    }
}
