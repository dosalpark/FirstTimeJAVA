package Week3.inter;

public interface MultiRemoteController {

    void turnOnOff();
    void channelUp();
    void channelDown();
    void volumeUp();
    void volumeDown();

    // 매개변수와 반환타입 다형성 확인 메서드
    default MultiRemoteController getTV(Tv tv) { //tv라는 매개변수에 Main에있는 getTv(new "LgTv" <- 요값을 받아옴
        if(tv instanceof SamsungTv) {           //받아온 값의 원래 클래스 값을 확인하여 MultiRemoteController lg <- 요기에 넣어줌.
            return (SamsungTv) tv;
        } else if(tv instanceof LgTv){
            return (LgTv) tv;
        } else {
            throw new NullPointerException("일치하는 Tv 없음");
        }
    }

}
