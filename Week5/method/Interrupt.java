package Week5.method;
//public class Interrupt {
//    public static void main(String[] args) {
//        Runnable task = () -> {
//            try {
//                //여기서 쓰레드가 1초 뒤에 아래 쓰레드 명을 출력하는데 18번째 인터럽트가 작동하면서 바로 catch문으로 빠져버림
//                Thread.sleep(1000);
//                System.out.println(Thread.currentThread().getName());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("task : " + Thread.currentThread().getName());
//        };
//
//        Thread thread = new Thread(task, "Thread");
//        thread.start();
//
//        thread.interrupt();
//
//        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());
//
//    }
//}
public class Interrupt {
    public static void main(String[] args) {
        Runnable task = () -> {
            //현재 실행되는 쓰레드의 인터럽트 상태(인터럽트면 true)가 false 일 때 만 실행
            while (!Thread.currentThread().isInterrupted()) {
                //실행되자마자 아래 인터럽트되서 바로 catch문으로 이동 후 break;
                //interrut가 일어나서 바로 sleep하자마자 실행됨.
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread");
        System.out.println("쓰레드 생성직후" + thread.isInterrupted());
        thread.start();

        System.out.println("인터럽트전" + thread.isInterrupted());
        thread.interrupt();

        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());

    }
}