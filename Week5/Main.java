package Week5;

public class Main {
    public static void main(String[] args) {
        // 1. Thread Class를 이용(상속)
//        TestThread thread = new TestThread();
//        thread.start();
        // 2. Runnable interface를 implements 해서 이용(인터페이스)
//        Runnable run = new TestRunnable();
//        Thread thread = new Thread(run);
//        thread.start();
        //3. 람다식
        //아까 따로 클래스를 만들었던 내용을 아래에 적는다.
        //그 값을 task에 넣는다.
        Runnable task = () -> {
            int sum = 0;
            for (int i = 0; i < 50; i++) {
                sum += i;
                System.out.println(sum);
            }
            System.out.println(Thread.currentThread().getName() + " 최종 합 : " + sum);
        };
        //아까 runnable 안에 있던 run 객체를 넣듯이 task 를 Thread 안에 넣는다.: Thread thread1 = new Thread(task);
        //그리고 setName을 통해 이름을 넣어준다: thread1.setName("thread1");
        Thread thread1 = new Thread(task);
        thread1.setName("thread1");
        Thread thread2 = new Thread(task);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();

    }
}
