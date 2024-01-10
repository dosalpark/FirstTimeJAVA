package Week5;

public class TestRunnable implements Runnable{
    // 2. Runnable interface를 implements 해서 이용(인터페이스)
    @Override
    public void run() {
        //실제 쓰레드에서 수행할 작업 입력
        for (int i = 0; i < 100; i++ ) {
            System.out.print("$");
        }
    }
}
