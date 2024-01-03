package Study;
import java.util.Scanner;

public class Random {
    public static void main(String[] args) {

        //1~100사이의 랜덤한 값을 생성하여 사용자가 입력해서 몇 번 만에 맞추나 확인하는 코드

        int random = (int)(Math.random()*100)+1;  //1~100사이의 정수 랜덤 설정
        int count = 0; //몇번만에 맞췄는지 카운트 값
        int user; //사용자에게 입력받아서 비교 할 값
        Scanner scanner = new Scanner(System.in); //스캐너 로딩

//        System.out.println(random);  //Test용 random 값 확인

        do{ //조건에 상관없이 최초 1회 실행
            user = scanner.nextInt(); // 사용자에게 입력값 받음.
            if (1 > user || user > 100) { // 입력값이 1~100 아닐때 count+1하면서 범위 벗어났다고 알려줌.
            count = count + 1;
            System.out.println(" 범위를 벗어났습니다.");
            } else {
                if (random > user) { //사용자 값이 더 작을경우 count +1 후 정답은 높다고 알려줌
                    count = count + 1;
                    System.out.println("정답은 " + user + "보다 높습니다.");
                } else if (random < user) { //사용자 값이 더 높을경우 count +1 후 정답은 낮다고 알려줌
                    count = count + 1;
                    System.out.println("정답은 " + user + "보다 낮습니다.");
                } else if (user == random) {  //입력값이 정답과 같을때 count +1 후 빠져나감.
                    count = count + 1;
                    break;
                }
            }
        } while (random != user);
        System.out.println("정답입니다!." + count + "번 만에 맞추셨습니다."); //위에 카운트 한 수 출력
    }
}
