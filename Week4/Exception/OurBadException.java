package Week4.Exception;

public class OurBadException extends Exception{
    //예외 클래스를 만들어서 예외를 정의
    public OurBadException() {
        super("위험한 행동을 하면 예외처리를 꼭 해야함!");
    }

}
