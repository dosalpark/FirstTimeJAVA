import java.util.*;
public class LoopTest {
    public static void main(String[] args) {
        //구구단 입력받은 단만 출력, 9단 이상 받았을땐 메세지 출력

        Scanner scanner = new Scanner(System.in);
        System.out.print("구구단을 출력할 단을 입력해주세요. >>> ");
        int userInput = scanner.nextInt();

        if (userInput<9) {
            for (int i = 1; i < 10; i++) {
                if (userInput == i) {
                    System.out.println("[" + i + " 단]");
                    for (int j = 1; j < 10; j++) {
                        System.out.println(i + " * " + j + " = " + (i * j));
                    }
                }
            }
        } else {
            System.out.println("9단 이하로 입력해주세요.");
        }
    }
}
