public class BreakTest {
    public static void main(String[] args) {
        //break문: 가장 가까운 블록의 for문, while문, switch문을 중단

        //while문에서의 break
        int number = 0;
        while ( number < 3 ) {
            number++;
            System.out.println(number);
                if (number == 2) {
                    break;
                }
        }

        //for문에서의 break
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i );
            if (i == 2) {
                break; //i가 2되면 바깥 for문이 종료됨. 근데 이미
            }
            for (int j = 0; j < 10; j++) {
                System.out.println("j: " + j );
                if(j == 2) {
                    break;  //j가 2되면 안쪽 for문이 종료
                }
            }

        }

        //switch문에서의 break
        int i = 4;
        String str = "";
        switch (i) {
            case 1:
                str = "숫자1";
                break;
            case 2:
                str = "숫자2";
                break;
            case 3:
                str = "숫자3";
                break;
            default: str = "1~3 범위를 초과하였습니다";
        }
        System.out.println(str);
    }
}