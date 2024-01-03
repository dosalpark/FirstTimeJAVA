package Week3.abs;

public class BenzCar extends Car {
    String company; // 자동차 회사 : GENESIS
    String color; // 자동차 색상
    double speed;  // 자동차 속도 , km/h

    @Override
    public void horn() {
        System.out.println("Benz 빵빵");
    }

}