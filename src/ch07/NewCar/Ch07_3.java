package src.ch07.NewCar;

public class Ch07_3 {
    public static void main(String[] args) {
        NewCar oldCar = new NewCar("서울0가1111");
        System.out.println("oldCar의 차량번호: " + oldCar.getCarNumber());
        oldCar.setCarNumber("서울1가1111");
        System.out.println("변경 후 oldCar의 차량번호: " + oldCar.getCarNumber());
    }
}
