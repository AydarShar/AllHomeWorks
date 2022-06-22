package model.implementations;

import static constants.GameSettings.X_AXIS;
import static constants.GameSettings.Y_AXIS;
import static model.implementations.PointStatus.EMPTY;

/**
 * Точка на карте
 */

public class Point {
    private int x; // поля класса Point не будут доступны за его пределами
    private int y; // чтобы можно было не ограничивать область поля - не даем доступа к ним
    private PointStatus pointStatus = EMPTY;

    public PointStatus getPointStatus() {
        return pointStatus;
    }

    public void setPointStatus(PointStatus pointStatus) {
        this.pointStatus = pointStatus;
    }

    public Point setX(int x) {
        if (x > X_AXIS) throw new UnsupportedOperationException("Ось х короче чем " + x);
        this.x = x;
        return this; // возвращает ссылку на объект текущего класса (Point, а не void в методе)
    }

    public Point setY(int y) {
        if (y > Y_AXIS) throw new UnsupportedOperationException("Ось y короче чем " + y);
        this.y = y;
        return this;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

