package Week5;

public class Group {
    public static void main(String[] args) {
        Runnable task = () -> {
            //쓰레드들이 인터럽트(실행대기상태)가 아닐때
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    //1초동안 기다렸다가 출력
                    // 출력물 3~ 부터 1초에 한번씩 쓰레드이름을 출력하다가 맨 아래 5초 후 인터럽트 되면 break로 빠져나가서 17번째줄 출력
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println(Thread.currentThread().getName() + " Interrupted");
        };

        // ThreadGroup 클래스로 객체를 만듭니다.
        ThreadGroup group1 = new ThreadGroup("Group1");

        // Thread 객체 생성시 첫번째 매개변수로 넣어줍니다.
        // Thread(ThreadGroup group, Runnable target, String name)
        Thread thread1 = new Thread(group1, task, "Thread 1");
        Thread thread2 = new Thread(group1, task, "Thread 2");

        // Thread에 ThreadGroup 이 할당된것을 확인할 수 있습니다.
        // 출력물 1,2번쨰
        System.out.println("Group of thread1 : " + thread1.getThreadGroup().getName());
        System.out.println("Group of thread2 : " + thread2.getThreadGroup().getName());

        // 쓰레드 실행으로 맨위 Runnable로 이동
        thread1.start();
        thread2.start();

        try {
            // 현재 쓰레드를 지정된 시간동안 멈추게 합니다.
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // interrupt()는 일시정지 상태인 쓰레드를 실행대기 상태로 만듭니다.
        //5초가 지났으니 그룹으로 묶인 쓰레드1,2번을 중단
        group1.interrupt();

    }
}