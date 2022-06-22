// Задание 6.

public class Test6 extends T1 {
    public static void main(String[] args) {
        Test6 t = new Test6();
        System.out.println(((T1) t).print()); // в выводе изменил 2 на 1
    }

    static String print() {return "Test";} // static
}

class T1 extends T2 {
    static String print() {return "T1";} // static
}

class T2 {
    static String print() {return "T2";} // static
}

