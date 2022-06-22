/**
 * Варианты решения через Externalizable:
 * 1. Не упоминать поле owner в переопределенных методах.
 * 2. Зашифровать даные при десериализации
 * (раскомментировать строки 40, 46, 52-55)
 *
 * 3. Serializable использовать transient у поля owner
 * (закомментировать строки с 16 по 78, раскомментировать строки 80-98)
 */

package ioTests.models;
import java.io.*;
import java.util.Base64;
import java.util.List;

public class Box2 implements Externalizable {
    String owner;
    List<Fruit> fruits;

    private static final long SERIAL_VERSION_UID = 2;

    public Box2() {
    }

    public Box2(String owner, List<Fruit> fruits) {
        this.owner = owner;
        this.fruits = fruits;
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits +
                ", owner='" + owner + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        //out.writeObject(this.getOwner());
        out.writeObject(this.getFruits());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        //owner = this.secret((String) in.readObject());
        //owner = (String) in.readObject();
        fruits = (List<Fruit>) in.readObject();
    }

    // метод для шифрования данных при десериализации
//    private String secret(String data) {
//        String secret = Base64.getEncoder().encodeToString(data.getBytes());
//        return secret;
//    }

    /**
     * Getter & Setter
     */

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(List<Fruit> fruits) {
        this.fruits = fruits;
    }
}



//public class Box2 implements Serializable {
//    transient String owner;
//    List<Fruit> fruits;
//
//    private static final long SERIAL_VERSION_UID = 1;
//
//    public Box2(String owner, List<Fruit> fruits) {
//        this.owner = owner;
//        this.fruits = fruits;
//    }
//
//    @Override
//    public String toString() {
//        return "Box{" +
//                "fruits=" + fruits +
//                ", owner='" + owner + '\'' +
//                '}';
//    }
//}
