package ioTests.models;

import java.io.Serializable;
import java.util.List;

public class Box implements Serializable {
    String owner;
    List<Fruit> fruits;

    private static final long SERIAL_VERSION_UID = 1;

       public Box(String owner, List<Fruit> fruits) {
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
}
