package src.ch08.ch08_abstract_quiz4;

class Student extends Person {
    int grade;
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    public void introduce() {
        System.out.println("안녕! 내 이름은 " + name + "고, 나이는 " + age + "살이야.");
    }
    public void gradeInfo() {
        System.out.println("현재 대학교 " + grade + "학년이야.");
    }
}
