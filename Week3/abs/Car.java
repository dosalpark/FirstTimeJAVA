package Week3.abs;

public abstract class Car {
        double speed;  // 자동차 속도 , km/h
    public double gasPedal(double kmh) {
        speed = kmh;
        System.out.println("현재 속도는" + speed + " 입니다.");
        return speed;
    }

    public double brakePedal() {
        speed = 0;
        System.out.println("현재 속도는" + speed + " 입니다.");
        return speed;
    }
    public abstract void horn() ;
}
