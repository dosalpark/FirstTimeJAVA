package Week5.method;

public class Join {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                //메인쓰레드가 5초간 정지
                Thread.sleep(5000); // 5초
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(task, "thread");

        thread.start();

        long start = System.currentTimeMillis();

        try {
            //메인쓰레드가 끝날때까지 기다리고 아래 실행까지 소요된시간 출력
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // thread 의 소요시간인 5000ms 동안 main 쓰레드가 기다렸기 때문에 5000이상이 출력됩니다.
        System.out.println("소요시간 = " + (System.currentTimeMillis() - start));
    }
}
