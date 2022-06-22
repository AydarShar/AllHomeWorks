package ioTests.Task6;

public class Main {
    public static void main(String[] args) {

        GsonParser parser = new GsonParser();
        Squad squad = parser.parse();

        System.out.println(squad.toString());
    }
}
