package Week5.method;


public class Synchronized {
    public static void main(String[] args) {
        AppleStore appleStore = new AppleStore();

        //10개의 사과를 3개의 쓰레드가 1초마다 먹는데 1개남았을때 3명다 while문으로 들어와서 더 먹어서 -2까지 내려감.
        //아래 if 구문 위에 synchronize(this) 하면 아래 if 구문에 쓰레드 한놈씩 들어감.
        Runnable task = () -> {
            while (appleStore.getStoredApple() > 0) {
                appleStore.eatApple();
                System.out.println("남은 사과의 수 = " + appleStore.getStoredApple());
            }

        };
        //3개의 쓰레드를 만들어서 생성과 동시에 Runnable 상태로 전환
        for (int i = 0; i < 3; i++) {
            new Thread(task).start();
        }
    }
}

class AppleStore {
    private int storedApple = 10;

    public int getStoredApple() {
        return storedApple;
    }

    public void eatApple() {
        //아래 if 로직에 3개가 같이 들어가는게 아니라 하나씩 쓰레드 들어감.
        synchronized (this) {
            if (storedApple > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                storedApple -= 1;
            }
        }
    }
}
