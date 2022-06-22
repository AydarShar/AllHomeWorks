// Задание 4.

class Point4 {
    static int x = 2;
}
class Test4 extends Point4 {
    double x = 4.7;
    void printBoth() {
        System.out.println(x + " " + super.x);
    }
    public static void main(String[] args) {
        Test4 sample = new Test4();
        sample.printBoth();
        System.out.println( sample.x + " " + ((Point4)sample).x );
    }
}
