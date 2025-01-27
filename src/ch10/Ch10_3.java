package src.ch10;

import java.awt.*;
import java.util.HashSet;
import java.util.Iterator;

public class Ch10_3 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        System.out.println("집합 크기: " + numbers.size());
        if (numbers.contains(3)) {
            System.out.println("3이 포함돼 있습니다.");
        } else {
            System.out.println("3이 포함돼 있지 않습니다.");
        }
        Iterator<Integer> iterator = numbers.iterator();
        System.out.println("집합 요소: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        numbers.clear();
        System.out.println("집합이 비어 있는가? " + numbers.isEmpty());
    }
}
