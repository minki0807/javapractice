import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력하세요. --> ");
        int intValue = scan.nextInt();

        System.out.print("실수를 입력하세요. --> ");
        double doubleValue = scan.nextDouble();

        int sum = intValue + (int)doubleValue;
        double sub = (double)intValue - doubleValue;
        double mul = intValue * doubleValue;
        int div = intValue / (int)doubleValue;

        System.out.println("덧셈 결과(정수): " + sum);
        System.out.println("뺄셈 결과(실수): " + sub);
        System.out.println("곱셈 결과(실수): " + mul);
        System.out.println("나눗셈 결과(정수): " + div);
    }
}