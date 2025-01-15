import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true) {
            System.out.println("숫자를 무한 반복해서 더하는 중입니다. ");
            System.out.print("숫자를 입력하세요/ -> ");
            int input = scanner.nextInt();
            sum = sum + input;
            System.out.println("결과: " + sum);
            if(sum > 10000) {
                break;
            }
        }
        System.out.println("반복문을 탈출했습니다.");
    }
}