package model.implementations.players;

import model.Interfaces.Field;
import model.Interfaces.Player;
import model.implementations.Point;
import model.implementations.Vessel;

import java.util.List;

public class User implements Player {
    private Field field;

    public User(Point maxPoint) {
        field = new Point[maxPoint.getX() * maxPoint.getY()];
    }

    @Override
    public void getReadyForGame() {

    }

    @Override
    public Boolean isReadyToPlay() {
        return null;
    }

    @Override
    public List<Vessel> getVessels() {
        return null;
    }

    @Override
    public Point[] getPlayerField() {
        return field;
    }
}
