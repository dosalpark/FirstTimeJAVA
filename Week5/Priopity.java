package Week5;

public class Priopity {
    public static void main(String[] args) {
        //첫번째 쓰레드 task1
        Runnable task1 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
        };
        //두번째 쓰레드 task2
        Runnable task2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("*");
            }
        };

        Thread thread1 = new Thread(task1);
        thread1.setPriority(8); //쓰레드 우선순위 8
        int threadPriority = thread1.getPriority();
        System.out.println("threadPriority = " + threadPriority);

        Thread thread2 = new Thread(task2);
        thread2.setPriority(2); //쓰레드 우선순위 2

        thread1.start();
        thread2.start();
    }
}
