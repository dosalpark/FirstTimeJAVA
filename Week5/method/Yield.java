package Week5.method;

public class Yield {
    public static void main(String[] args) {
        Runnable task = () -> {
            //1초마다 자기의 이름을 (쓰레드1,2)를 찍음 (10번씩찍어야함)
            //아래 Thread.sleep(5000); 이 지나고 Thread 1이 interrut 되기 때문에 인터럽트 발생한 쓰레드를 yield 처리 함.
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                }
            } catch (InterruptedException e) {
                Thread.yield();
            }
        };

        Thread thread1 = new Thread(task, "thread1");
        Thread thread2 = new Thread(task, "thread2");

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.interrupt();

    }
}
