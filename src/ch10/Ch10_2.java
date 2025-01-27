package src.ch10;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ch10_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        int size = numbers.size();
        System.out.println("리스트의 크기: " + size);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("숫자: " + numbers.get(i));
        }
        numbers.remove(1);
        System.out.println("요소를 삭제한 후 리스트: " + numbers);
    }
}
