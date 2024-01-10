package Week5;

public class TestThread extends Thread{
    // 1. Thread Class를 이용(상속)
    @Override
    public void run() {
        //실제 쓰레드에서 수행할 작업 입력
        for (int i = 0; i < 100; i++ ) {
            System.out.print("*");
        }
    }
}
