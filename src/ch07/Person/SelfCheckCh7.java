package src.ch07.Person;

public class SelfCheckCh7 {
    public static void main(String[] args) {
        Person person = new Person("김길벗", 21);
        person.displayInfo();
        person.setName("이코천");
        person.setAge(22);
        System.out.println("수정한 이름: " + person.getName());
        System.out.println("수정한 나이: " + person.getAge());
    }
}
