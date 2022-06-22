// Задание 5.

class Test5 {
    static void mountain() { // static
        System.out.println("Как дела?");
    }
    static Test5 favorite(){
        System.out.print("Привет! ");
        return null;
    }
    public static void main(String[] args) {
        favorite().mountain();
    }
}
