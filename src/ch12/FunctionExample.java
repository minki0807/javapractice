package src.ch12;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, String> upperCase = (str) -> str.toUpperCase();
        System.out.println(upperCase.apply("Hello world"));
    }
}
