package Week5.method;

public class Sleep {
    public static void main(String[] args) {
        //쓰레드 만들기 위한 Runnable task 객체 생성
        Runnable task = () -> {
            //sleep은 try ~ catch로 예외처리 반드시 필요
            try {
                Thread.sleep(2000);
                //InterruptedException을 실행하면 sleep이 깨짐
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };
        //쓰레드 생성 및 실행대기로 변경하면서 위의 Runnable 로직 실행
        Thread thread = new Thread(task, "Thread");
        thread.start();

        try {
            thread.sleep(1000);
            System.out.println("sleep(1000) : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}