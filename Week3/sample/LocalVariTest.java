package Week3.sample;

public class LocalVariTest {
    public static void main(String[] args) {
        LocalVariTest main = new LocalVariTest();
        System.out.println(main.getNumber()); //2
        System.out.println(main.getNumber()); //2
    }

    //지역변수
    //해당 메서드가 실행 될 때 마다 독립적인 값을 저장하고 관리.
    //지역변수는 메서드 내부에서 정의 될 때 생성되며, 메서드가 종료 될 때 소멸된다.
    //위의 2개의 sout 값이 동일한 것도
    public int getNumber() {
        int number = 1;
        number += 1;
        return number;
    }
}
