package src.ch08.ch08_interface_quiz5;

class Student implements Person {
    int grade;
    int age;
    String name;

    public Student(String name, int age, int grade) {
        this.grade = grade;
        this.name = name;
        this.age = age;

    }
    public void introduce() {
        System.out.println("안녕! 내 이름은 " + name + "고, 나이는 " + age + "살이야.");
    }
    public void gradeInfo() {
        System.out.println("현재 대학교 " + grade + "학년이야.");
    }
}
