/* инфо: https://www.youtube.com/watch?v=f07nsoaFpeA */
public class StackOverflowError {
    StackOverflowError() {
        System.out.println("Hello, World!");
    }

    StackOverflowError a = new StackOverflowError();

    public static void main(String[] args) {
        StackOverflowError stackOverflowError = new StackOverflowError();
    }
}
