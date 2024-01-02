package Week3;
//클래스 만드는 4가지 STEP
//1. 만들려고 하는 설계도를 선언(클래스 선언)
//2. 객체가 가지고 있어야 할 속성(필드)을 정의
//3. 객체를 생성하는 방식을 정의 (생성자)
//4. 객체가 가지고 있어야 할 행위(매서드)를 정의
//1. 클래스 영역
// 만들려고 하는 클래스 선언
public class Car {
    //2. 필드 영역
// 객체가 가지고있어야 할 필드 정의
    //1. 고유 데이터 영역
    String company; // 제조사
    String model = "Gv80"; // 자동차 모델
    String color; // 자동차 색상
    //2. 상태 데이터 영역
    double price; // 자동차 가격
    double speed; // 자동차 속도
    char gear; // P R N D
    boolean lights = true; // on, off
    //3. 객체 데이터 영역
    Tire tire = new Tire();
    Door door;
    Handle handle;

//3. 생성자 영역
// 처음 객체가 생성(instance화) 될 때 어떤 로직 수행, 어떤 값이 필수로 입력되어야하는지 정의
    public Car () {
        //logic 입력
        //기본 생성자: 생략이 가능
        System.out.println("생성자가 호출되었습니다! 객체가 생성됩니다.");
    }

//4. 메서드 영역
    //gasPedal
    //input: kmh
    //output: speed
    double gasPedal (double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    } //double kmh가 input변환해서 speed로 주는게 output

    //BrakePedal
    //input: X
    //output: speed
    double brakePedal () {
        speed = 0;
        return speed;
    } //input은 없고 speed를 output

    //changeGear
    //input: gear
    //output: gear
    char changeGear (char type) {
        gear = type;
        return gear;
    } //변경한 gear type을 받아서 gear로 output

    //onOffLight
    //input: X
    //output: lights
    boolean onOffLight () {
        lights = !lights;
        return  lights;
    } //on/off 밖에 없으니 가지고 있는 값을 != 처리 해서 output

    //horn
    //input: X
    //output: X
    void horn () {
        System.out.println("빵빵!");
    }
    //자동차의 속도 ... 가변길이 메서드
    void carSpeed(double ... speeds) {
        for ( double v : speeds){
            System.out.println("v = "+ v);
        }
    }

}

