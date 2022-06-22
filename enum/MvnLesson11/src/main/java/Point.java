// ссылка на д/з : https://docs.google.com/document/d/1E_gU5MrRIwuXk_YlZK2Sw8lFuNhWHg2n6gaiRsLyym0/edit

// Задание 2.
interface Colorable {
    void setColor(int color);
    int getColor();
}
class Point { int x, y; };
abstract class ColoredPoint extends Point implements Colorable { // abstract
    int color;
}