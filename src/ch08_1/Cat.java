package src.ch08_1;

public class Cat extends Animal {

    public void rub() {
        System.out.println(name + "가 몸을 비빕니다.");
    }

    public void eat() {
        super.eat();
        System.out.println(name + "가 닭고기를 먹습니다. ");
    }
}
