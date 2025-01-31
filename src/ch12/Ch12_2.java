package src.ch12;

public class Ch12_2 {
    public static void main(String[] args) {
        CalculatorInterface add = (a, b) -> a + b;
        int result = add.operate(10, 20);
        System.out.println("결과: " + result);
    }
}
