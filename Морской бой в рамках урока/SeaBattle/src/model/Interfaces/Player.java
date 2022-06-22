package model.Interfaces;

import model.implementations.Point;
import model.implementations.Vessel;

import java.util.List;

public interface Player {
    void getReadyForGame();
    Boolean isReadyToPlay();
    List<Vessel> getVessels();
    Point[] getPlayerField();
}
