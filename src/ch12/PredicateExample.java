package src.ch12;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        System.out.println(isEven.test(1));
        System.out.println(isEven.test(2));
    }
}
