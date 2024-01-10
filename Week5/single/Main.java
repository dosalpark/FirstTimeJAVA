package Week5.single;

public class Main {
    public static void main(String[] args) {
        //for문을 통해 돌아간 값을 Runnable tesk 변수에 담음.
        Runnable task = () -> {
            //현재 실행되는 쓰레드 이름 확인
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
        };
        //현재 실행되는 쓰레드 이름 확인
        System.out.println(Thread.currentThread().getName());
        //새로운 쓰레드를 생성하면서 task 변수의 값을 입력
        Thread thread1 = new Thread(task);
        //쓰레드에 이름을 지정
        thread1.setName("thread1");
        //쓰레드 실행
        thread1.start();
    }
}