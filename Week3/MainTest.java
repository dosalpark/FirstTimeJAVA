package Week3;
public class MainTest {
    public static void main(String[] args) {
        Car[] carArray = new Car[3]; //만들어놓은 Car 클래스를 이용해 배열 생성

        Car car1 = new Car(); //car1 생성
        car1.changeGear('P'); //car1 changeGear에 P 입력
        carArray[0] = car1; //carArray 배열에 넣음

        Car car2 = new Car();
        car2.changeGear('N');
        carArray[1] = car2;

        Car car3 = new Car();
        car3.changeGear('D');
        carArray[2] = car3;

        for(Car car: carArray) { //car라는 변수 만들어서 배열 carArray에 있는 car들의 gear 출력
            System.out.println("car.gear = " + car.gear);
        }


    }
}
