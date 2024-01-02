package Week3.extend;

public class MainTest {
    public static void main(String[] args) {
        // 부모 클래스 객체에서 자식 클래스 멤버 사용
        //사용할수없어서 오류 발생
        CarTest car = new CarTest();
        // car.engine = "Orion"; // 오류
        // car.booster(); // 오류

        // 자식 클래스 객체 생성
        //engine, booster는 고유 자식클래스임
        SportsCarTest sportsCarTest = new SportsCarTest();
        sportsCarTest.engine = "Orion";
        sportsCarTest.booster();

        // 자식 클래스 객체에서 부모 클래스 멤버 사용
        //상속받아서 (public class SportsCarTest extends CarTest) 부모클래스 사용 가능
        sportsCarTest.company = "GENESIS";
        sportsCarTest.setModel("GV80");
        System.out.println("sportsCar.company = " + sportsCarTest.company);
        System.out.println("sportsCar.getModel() = " + sportsCarTest.getModel());
        System.out.println();

        sportsCarTest.horn();
        System.out.println(sportsCarTest.changeGear('D'));
    }
}