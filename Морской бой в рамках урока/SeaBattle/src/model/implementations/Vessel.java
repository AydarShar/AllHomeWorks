package model.implementations;

import model.Interfaces.Damager;
import model.Interfaces.Sailable;

public class Vessel implements Sailable, Damager {
    Point[] points;
    Integer vesselLength;

    public Vessel(Integer vesselLength) {
        this.vesselLength = vesselLength;
        points = new Point[vesselLength];
    }

    @Override // Переопределение метода. Есть общий метод (в супер классе | родителе), но он должен делать разные вещи в зависимости от того, в каком классе он был вызван.
    public void sail() {

    }

    @Override
    public void attack() {

    }
}
