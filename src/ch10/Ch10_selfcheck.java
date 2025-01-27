package src.ch10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Ch10_selfcheck {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("홍길동");
        students.add("김길벗");
        students.add("이코천");
        students.add("홍길동");
        System.out.println("학생 명단");
        for (String student : students) {
            System.out.println(student);
        }

        HashSet<String> uniqueStudents = new HashSet<>(students);
        uniqueStudents.add("강난순");
        System.out.println("\n학생 명단(중복 삭제)");
        for (String student : uniqueStudents) {
            System.out.println(student);
        }

        HashMap<String, Integer> studentScores = new HashMap<>();
        studentScores.put("홍길동", 85);
        studentScores.put("김길벗", 92);
        studentScores.put("이코천", 78);
        studentScores.put("강남순", 90);
        System.out.println("\n학생 명단과 점수");
        for (String key : studentScores.keySet()) {
            System.out.println(key + "의 점수: " + studentScores.get(key) + "점");
        }

        if (studentScores.containsKey("홍길동")) {
            System.out.println("\n홍길동의 점수는" + studentScores.get("홍길동") + "점입니다.");
        }
    }
}
