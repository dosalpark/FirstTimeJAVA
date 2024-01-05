package Week4.Exception;

public class StudyException {
    public static void main(String[] args) {
        OurClass outClass = new OurClass();
        //try ~ catch ~ finally 구문
        //일단 try 하고 예외가 발생하면 그걸 catch 하고  finally 수행해야하는 로직을 수행해
        //일단 수행을 완료하면서 예외를 잡아라

        try {
            outClass.thisMethodIsDangerous(); //OurClass를 객체를 만들어 메소드를 실행
        } catch (OurBadException e) { //발생할수있는 플래그 기재 + 아래서 사용할 문자 e
            System.out.println(e.getMessage()); //OurBadException에 저장된 에러내용 호출
        } finally {
            System.out.println("우리는 방금 예외를 handling 했습니다. 예외 사항이 발생하든 여기를 거쳐요");
        }

    }
}
