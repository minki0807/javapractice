package src.ch11;

import java.awt.*;
import java.util.Scanner;

public class Ch11_4 {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero!");
        }

        System.out.println("프로그램 실행 중");
    }
}
