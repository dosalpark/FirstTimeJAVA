package Week5.method;

import java.util.ArrayList;
import java.util.List;

public class WaitNotify {
    public static String[] itemList = {
            "MacBook", "IPhone", "AirPods", "iMac", "Mac mini"
    };
    public static AppleStore2 appleStore2 = new AppleStore2();

    //재고의 MAX는 5개
    public static final int MAX_ITEM = 5;

    public static void main(String[] args) {

        // 가게 점원 쓰레드
        Runnable StoreClerk = () -> {
            while (true) {
                //0~4(MAX_ITEM:5)사이의 정수 중 랜덤한 값을 뽑아낸다.
                int randomItem = (int) (Math.random() * MAX_ITEM);
                //restock: 재고를 채우는 메소드, 꽉차면 대기 재고 입고되면 notity로 고객에게 알림
                //아이템리스트중에 0~4 랜덤으로 뽑아서 재고를 채움
                appleStore2.restock(itemList[randomItem]);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ignored) {
                }
            }
        };

        // 고객 쓰레드 (2명)
        Runnable Customer = () -> {
            while (true) {
                try {
                    Thread.sleep(77);
                } catch (InterruptedException ignored) {
                }
                //sale: 랜덤한 아이템리스트의 0~4까지중 하나를 구매
                int randomItem = (int) (Math.random() * MAX_ITEM);
                appleStore2.sale(itemList[randomItem]);
                System.out.println(Thread.currentThread().getName() + " Purchase Item " + itemList[randomItem]);
            }
        };


        new Thread(StoreClerk, "StoreClerk").start();
        new Thread(Customer, "Customer1").start();
        new Thread(Customer, "Customer2").start();

    }
}

class AppleStore2 {
    private List<String> inventory = new ArrayList<>();

    public void restock(String item) {
        synchronized (this) {
            while (inventory.size() >= WaitNotify.MAX_ITEM) {
                System.out.println(Thread.currentThread().getName() + " Waiting!");
                try {
                    wait(); // 재고가 꽉 차있어서 재입고하지 않고 기다리는 중!
                    Thread.sleep(333);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 재입고
            inventory.add(item);
            notify(); // 재입고 되었음을 고객에게 알려주기
            System.out.println("Inventory 현황: " + inventory.toString());
        }
    }

    public synchronized void sale(String itemName) {
        while (inventory.size() == 0) {
            System.out.println(Thread.currentThread().getName() + " Waiting!");
            try {
                wait(); // 재고가 없기 때문에 고객 대기중
                Thread.sleep(333);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        while (true) {
            // 고객이 주문한 제품이 있는지 확인
            for (int i = 0; i < inventory.size(); i++) {
                if (itemName.equals(inventory.get(i))) {
                    inventory.remove(itemName);
                    notify(); // 제품 하나 팔렸으니 재입고 하라고 알려주기
                    return; // 메서드 종료
                }
            }

            // 고객이 찾는 제품이 없을 경우
            try {
                System.out.println(Thread.currentThread().getName() + " Waiting!");
                wait();
                Thread.sleep(333);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}