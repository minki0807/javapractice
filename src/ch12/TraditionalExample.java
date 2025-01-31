package src.ch12;

public class TraditionalExample {
    public static void main(String[] args) {

        Check even = n -> n % 2 == 0? true : false;
        System.out.println(even.isEven(15));
    }
}
