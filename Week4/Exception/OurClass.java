package Week4.Exception;

public class OurClass {
    private final boolean just = true;

    //throws: 예외를 던지다? 발생시키다
    //"메서드명" throws OurBacException -> 해당 매서드가 어떤 예외사항을 던진수 있는지 알려주는 예약어
    public void thisMethodIsDangerous () throws OurBadException{
        //custom logic
        if (just) {
            //실제로 예외 객체를 던질 때 사용하는 예약어(처리라는데)?
            //throw new "객체명" ->
            throw new OurBadException();
        }
    }
}
