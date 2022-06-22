// Задание 3.

class Point3 {
    static int x = 2;
}
class Test3 extends Point3 {
    static double x = 4.7;
    public static void main(String[] args) {
        new Test3().printX();
    }
    void printX() {
        //напишите здесь свой код
        System.out.println(Point3.x + " и " + Point3.x);
    }
}
