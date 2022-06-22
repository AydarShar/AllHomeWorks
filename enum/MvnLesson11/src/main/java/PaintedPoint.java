// ссылка на д/з : https://docs.google.com/document/d/1E_gU5MrRIwuXk_YlZK2Sw8lFuNhWHg2n6gaiRsLyym0/edit

// Задание 1.
import java.util.ArrayList;
import java.util.List;

interface A {}
interface B extends A{}
interface C extends B{}

class Aa implements A {}
class Bb implements B {}
class Cc implements C {}

public class PaintedPoint {
    public static void main(String[] args) {
        Aa a = new Aa();
        Bb b = new Bb();
        Cc c = new Cc();

        List<A> cList = new ArrayList<>(); // <A> вместо <C>
        cList.add(a);
        cList.add(b);
        cList.add(c);
    }
}
