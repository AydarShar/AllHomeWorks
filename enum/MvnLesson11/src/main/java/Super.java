// ссылка на д/з : https://docs.google.com/document/d/1E_gU5MrRIwuXk_YlZK2Sw8lFuNhWHg2n6gaiRsLyym0/edit

// Задание 4.
class Super {
    static int taxi = 1729;
}
class Sub extends Super {
    static { System.out.print("Sub "); } // вариант 1 - закоментировать эту строку
}
class Test {
    public static void main(String[] args) {
        Super sup = new Super(); // вариант 2 - заменить Sub на Super

        System.out.println(sup.taxi);
    }
}
