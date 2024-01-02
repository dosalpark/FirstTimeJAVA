package Week3;
public class MainTest2 {
    public static void main(String[] args) {

        //Car class에 입력한 기본값 확인
        Car car = new Car(); //객체 생성
        System.out.println("car.model = " + car.model); //car 클래스에서 설정한 Gv80;
        System.out.println("car.lights = " + car.lights); //car 클래스에서 설정한 ture
        System.out.println("car.color = " + car.color); //설정X null로 나옴
        System.out.println("car.tire = " + car.tire); //car 클래스에서  Tire tire = new Tire(); 해놔서 주소값이 뜸.
        System.out.println("car.handle = " + car.handle); //설정X null로 나옴

        //필드 사용 (속성)
        car.color = "blue"; //필드 color에 "blue" 저장
        car.speed = 100.0;
        car.lights = false;

        System.out.println("car.color = " + car.color);
        System.out.println("car.speed = " + car.speed);
        System.out.println("car.lights = " + car.lights);

        //메소드 호출 및 반환값 확인 (행위) : 반환값 없을때는 void를 작성
        double speeds = car.gasPedal(100, 'D');
        System.out.println("speeds = " + speeds);

        boolean lights = car.onOffLight();
        System.out.println(lights);

        System.out.println(car.gear);

        car.carSpeed(30, 40, 80);
        car.carSpeed(150, 180, 190, 200);
    }
}
