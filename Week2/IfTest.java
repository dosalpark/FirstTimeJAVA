import java.util.Objects;
import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
//        //[if문] flag의 값에 따른 출력문장 변화
//        boolean flag = true;
//        if (flag) {
//            System.out.println("값이 ture입니다.");
//        } else {
//            System.out.println("값이 false입니다.");
//        }
//
//        //[if -else if문]
//        int number = 3 ;
//        if ( number == 1 ) {
//            System.out.println("number값은 1 입니다.");
//        } else if ( number == 2 ) {
//            System.out.println("number값은 2 입니다.");
//        } else {
//            System.out.println("number값은 " + number + "입니다.");
//        }
//
//        //[중첩 if문]
//        boolean flag2 = false;
//        int number2 = 3;
//        if ( flag2 ) {
//            if ( number2 == 1 ) {
//                System.out.println("flag는 true고, number값은 1 입니다.");
//            } else if ( number2 ==2 ) {
//                System.out.println("flag는 true고, number값은 2 입니다.");
//            } else if ( number2 ==3 ) {
//                System.out.println("flag는 true고, number값은 3 입니다.");
//            } else {
//                System.out.println("flag은 ture고, number값은 확인 되지 않습니다.");
//            }
//        } else {
//            if ( number2 == 1 ) {
//                System.out.println("flag는 false고, number값은 1 입니다.");
//            } else if ( number2 ==2 ) {
//                System.out.println("flag는 false고, number값은 2 입니다.");
//            } else if ( number2 ==3 ) {
//                System.out.println("flag는 false고, number값은 3 입니다.");
//            } else {
//                System.out.println("flag은 false고, number값은 확인 되지 않습니다.");
//            }
//        }
        //[if문 활용(가위바위보)]

        //scanner 로딩
        Scanner scanner = new Scanner(System.in);

        //A,B 가위바위보 값 입력
        System.out.print("A 입력: ");
        String user1 = scanner.next();
        System.out.print("B 입력: ");
        String user2 = scanner.next();


            if (Objects.equals(user1, "가위")) {
                if (Objects.equals(user2, "가위")) {
                    System.out.println("A와 B는 비겼습니다.");
                } else if (Objects.equals(user2, "바위")) {
                    System.out.println("B가 이겼습니다.");
                } else if (Objects.equals(user2, "보")) {
                    System.out.println("A가 이겼습니다.");
                } else {
                    System.out.println("B가 이상한 값을 입력했습니다.");
                }
            } else if (Objects.equals(user1, "바위")) {
                if (Objects.equals(user2, "가위")) {
                    System.out.println("A가 이겼습니다.");
                } else if (Objects.equals(user2, "바위")) {
                    System.out.println("A와 B는 비겼습니다.");
                } else if (Objects.equals(user2, "보")) {
                    System.out.println("B가 이겼습니다.");
                } else {
                    System.out.println("B가 이상한 값을 입력했습니다.");
                }
            } else if (Objects.equals(user1, "보")) {
                if (Objects.equals(user2, "가위")) {
                    System.out.println("B가 이겼습니다.");
                } else if (Objects.equals(user2, "바위")) {
                    System.out.println("A가 이겼습니다.");
                } else if (Objects.equals(user2, "보")) {
                    System.out.println("A와 B는 비겼습니다.");
                } else {
                    System.out.println("B가 이상한 값을 입력했습니다.");
                }
            } else {
                System.out.println("A가 이상한 값을 입력했습니다.");
            }
    }
}
