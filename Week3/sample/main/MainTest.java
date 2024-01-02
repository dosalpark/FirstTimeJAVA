package Week3.sample.main;

//2.
import Week3.sample.pk1.CarTest;

public class MainTest {
    public static void main(String[] args) {
        //패키지는 클래스의 일부분이며, 하위 패키지를 도트로 구분한다.

        //1.직접 경로입력
//        Week3.sample.pk1.CarTest car = new Week3.sample.pk1.CarTest();
//        Week3.sample.pk2.CarTest car2 = new Week3.sample.pk2.CarTest();
//
//        car.horn();
//        car2.horn();

        //2. import
        CarTest car = new CarTest();
        car.horn();
    }
}
