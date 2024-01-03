package Week3.inter;

public class Main {
    public static void main(String[] args) {

        // LG TV 구현체를 조작

        //LgtV 클래스를 MultiRemoteController 클래스로 자동 형변환
        // new LgTV("LG") LgTv클래스파일 생성자. 작성하면 super(company);로 부모클래스인 TV에 company값이 변경 됨.
        MultiRemoteController mrc = new LgTv("LG");
        mrc.turnOnOff(); //turnOnOff();부터 6개는 mrc에도 있고 각 클래스파일에도 override해서 있다..
        mrc.volumeUp();
        mrc.channelDown();
        mrc.channelUp();
        mrc.turnOnOff();

        // 조작 대상을 Samsung TV로 교체
        System.out.println("\n<Samsung TV로 교체>");
        mrc = new SamsungTv("Samsung");
        mrc.turnOnOff();
        mrc.channelUp();
        mrc.volumeDown();
        mrc.volumeUp();
        mrc.turnOnOff();


        // 매개변수, 반환타입 다형성 체크
        System.out.println("\n<매개변수, 반환타입 다형성 체크>");

        MultiRemoteController samsung = mrc.getTV(new SamsungTv("Samsung"));

        samsung.turnOnOff();

        SamsungTv samsungTv = (SamsungTv) samsung;
        samsungTv.turnOnOff();


        System.out.println();

        MultiRemoteController lg = mrc.getTV(new LgTv("LG"));
        lg.turnOnOff();


        LgTv lgTv = (LgTv) lg;
        lgTv.turnOnOff();

    }
}