package Week5.multi;

public class Main {
    public static void main(String[] args) {
        //1차: for문을 통해 돌아간 값을 Runnable tesk 변수에 담음.
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
        };
        //2차: for문을 통해 돌아간 값을 Runnable tesk2 변수에 담음.
        Runnable task2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("*");
            }
        };

        //새로운 쓰레드를 생성하면서 task 변수의 값을 입력
        //쓰레드에 이름을 지정(
//        Thread thread1 = new Thread(task2,"thread1"); 생성하면서 이름도 넣을수있음 ㅡㅡ
        Thread thread1 = new Thread(task2);
        thread1.setName("thread1");

        Thread thread2 = new Thread(task2);
        thread2.setName("thread2");
        //쓰레드 실행
        thread1.start();
        thread2.start();
    }
}
