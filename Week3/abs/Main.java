package Week3.abs;

public class Main {
    public static void main(String[] args) {
        //각 차량 클래스에서 추상화클래스를 override 한 horn 출력
        Car car3 = new ZenesisCar();
        car3.horn();

        //다른 기능 확인
        car3.gasPedal(30);
        car3.brakePedal();

    }
}
