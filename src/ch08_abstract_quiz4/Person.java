package src.ch08_abstract_quiz4;

abstract class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void introduce();
}
