// Задание 2.

class Point2 {
    static int x = 2;
}
class Test2 extends Point2 {
    static double x = 4.7;
    public static void main(String[] args) {
        new Test2().printX();
    }
    void printX() {
        //напишите здесь свой код
        System.out.println(Test2.x + " и " + Point2.x);
    }
}
