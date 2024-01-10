package Week5.Demon;
public class Main {
    public static void main(String[] args) {
        //for문을 통해 돌아간 값을 Runnable demon 변수에 담음.
        Runnable demon = () -> {
            for (int i = 0; i < 1000000; i++) {
                System.out.println(i + "번째 demon");
            }
        };
        //새로운 쓰레드를 생성하면서 demon 변수의 값을 입력
        Thread thread = new Thread(demon);
        //쓰레드를 데몬쓰레드로 만듬. 일반쓰레드는 setName("쓰레드명")
        //다른 쓰레드에 비해 리소스를 적게 할당됨
        thread.setDaemon(true); // true로 설정시 데몬스레드로 실행됨
        //데몬쓰레드실행
        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(i + "번째 task");
        }
    }
}