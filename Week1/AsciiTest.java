import java.util.Scanner;

public class AsciiTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 화면에서 값을 입력받음.

        // 1
        int asciiNumber = scanner.nextInt(); // 입력받은 값을 asciiNumber로 이동, [nextInt(): 정수를 입력받음.]
        char ch = (char)asciiNumber; //입력받은 정수를 문자로 치환

        System.out.println(ch); //입력받은 정수를 위의 과정을 거쳐서 ASCII코드에 해당하는 값으로 출력 (EX, 65 -> A)

        // 2
//        char asciichar = scanner.nextLine().charAt(0);  //문자열 입력받을때 첫번째 자리만 가져옴 [nextLine().charAt(0): 한줄을 입력받고 첫번째 문자를 입력함.]
//        int asciiNumber = (int)asciichar; //입력받은 첫번째 문자를 정수로 치환
//
//        System.out.println(asciiNumber); //입력받은 문자열 중 첫번째 문자를 ASCII코드에 해당하는 값으로 출력 (EX, d -> 100)

    }
}
