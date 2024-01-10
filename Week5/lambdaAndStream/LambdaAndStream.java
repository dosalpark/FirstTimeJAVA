package Week5.lambdaAndStream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaAndStream {
    //주차장 예제: 티켓, 파킹머니가 있는 차량만 주차가능.
    public static void main(String[] args) {

        //주차대상차량 선언
        ArrayList<Car> carsWantToPark = new ArrayList<>();
        //주차장 선언
        ArrayList<Car> parkingLot = new ArrayList<>();
        //주말주차장(티켓 돈 둘다있어야함)
        ArrayList<Car> weekEndParkingLot = new ArrayList<>();

        //5개의 car인스턴스 생성
        Car car1 = new Car("Benz", "Class E", true, 0);
        Car car2 = new Car("BMW", "Series 7", false, 100);
        Car car3 = new Car("BMW", "X9", false, 0);
        Car car4 = new Car("Audi", "A7", true, 0);
        Car car5 = new Car("Hyundai", "Ionic 6", false, 10000);

        carsWantToPark.add(car1);
        carsWantToPark.add(car2);
        carsWantToPark.add(car3);
        carsWantToPark.add(car4);
        carsWantToPark.add(car5);

        //주차 티켓이있는지, 파킹머니가 있는지 확인하는 리스트 생성
//        parkingLot.addAll(parkingCarWithTicket(carsWantToPark)); 대체
        parkingLot.addAll(parkCars(carsWantToPark, Car::hasTicket));
//        parkingLot.addAll(parkingCarWithMoney(carsWantToPark)); 대체
        parkingLot.addAll(parkCars(carsWantToPark, Car::noTicketButMoney));
        //주말주차장
//        parkingLot.addAll(parkCars(carsWantToPark, Car::weekEndParkingCars));
        parkingLot.addAll(parkCars(carsWantToPark, (Car car)->car.hasParkingTicket() && car.getParkingMoney() > 1000));

        for (Car car : parkingLot) {
            System.out.println("Parked Car : " + car.getCompany() + "-" + car.getModel());
        }
    }


    //리턴값을 List<Car>로 지정. 받은 값은 List<Car>의 carsWantToPark 값.
//    public static List<Car> parkingCarWithTicket(List<Car> carsWantToPark) {
//        ArrayList<Car> cars = new ArrayList<>();
//
//        for (Car car : carsWantToPark) {
//            //hasParkingTicket 가 true 면 가지고 있으면 cars 변수에 넣어줌.
//            if (car.hasParkingTicket()) {
//                cars.add(car);
//            }
//        }
//
//        return cars;
//    }
//
//    //리턴값을 List<Car>로 지정. 받은 값은 List<Car>의 carsWantToPark 값.
//    public static List<Car> parkingCarWithMoney(List<Car> carsWantToPark) {
//        ArrayList<Car> cars = new ArrayList<>();
//
//        for (Car car : carsWantToPark) {
//            //hasParkingTicket이 없으면서 getParkingMoney가 1000이상이면 cars 변수에 넣어줌.
//            if (!car.hasParkingTicket() && car.getParkingMoney() > 1000) {
//                cars.add(car);
//            }
//        }
//
//        return cars;
//    }

    //위의 두 메소드를 하나로 리팩토링: 내부 주요 로직을 함수로 전달

    public static List<Car> parkCars(List<Car> carsWantToPark, Predicate<Car> function) {
        List<Car> cars = new ArrayList<>();

        for (Car car : carsWantToPark) {
            //전달된 함수를 사용하여 구현
            if (function.test(car)){
                cars.add(car);
            }
        }
        return cars;
    }
}

class Car {
    private final String company; // 자동차 회사
    private final String model; // 자동차 모델

    private final boolean hasParkingTicket;
    private final int parkingMoney;

    public Car(String company, String model, boolean hasParkingTicket, int parkingMoney) {
        this.company = company;
        this.model = model;
        this.hasParkingTicket = hasParkingTicket;
        this.parkingMoney = parkingMoney;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public boolean hasParkingTicket() {
        return hasParkingTicket;
    }

    public int getParkingMoney() {
        return parkingMoney;
    }

    public static boolean hasTicket (Car car){
        return car.hasParkingTicket;
    }

    public static boolean noTicketButMoney(Car car){
        return  !car.hasParkingTicket && car.getParkingMoney() > 1000;
    }
    //주말주차장
    public static boolean weekEndParkingCars(Car car){
        return  car.hasParkingTicket && car.getParkingMoney() > 1000;
    }
}


//parameter함수를 변수타입을 무엇을 써야할까? -> (함수형) 인터페이스 : 추상 메소드를 딱 하나만 가지고있다.
//인터페이스는 타입 역할을 할 수 있기 때문에
interface predicate<T> {
    boolean test(T t);
}