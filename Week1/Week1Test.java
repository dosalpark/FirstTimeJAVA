import java.util.Scanner;

public class Week1Test {
    public static void main(String[] args) {
//        - 입력값
//            - 내가 좋아하는 요리 제목을 먼저 입력합니다.
//            - 요리 별점을 1~5 사이의 소수점이 있는 실수로 입력해주세요. (ex. 3.5)
//            - 이어서 내가 좋아하는 요리 레시피를 한 문장씩 10문장을 입력합니다.
//        - 출력값
//            - 입력이 종료되면 요리 제목을 괄호로 감싸서 먼저 출력 해줍니다.
//            - 이어서, 요리 별점을 소수점을 제외한 정수로만 출력해줍니다. (ex. 3)
//            - 바로 뒤에 정수별점을 5점만점 퍼센트로 표현했을 때 값을 실수로 출력해줍니다. (ex. 60.0%)
//            - 이어서, 입력한 모든 문장 앞에 번호를 붙여서 모두 출력 해줍니다.

        Scanner scanner = new Scanner(System.in);
        // 레시피 제목입력
        String title = scanner.next();
        // 별점 입력
        double doubleStar = scanner.nextDouble();
        // 레시피 10줄 입력
        String Recipe0 = scanner.next();
        String Recipe1 = scanner.next();
        String Recipe2 = scanner.next();
        String Recipe3 = scanner.next();
        String Recipe4 = scanner.next();
        String Recipe5 = scanner.next();
        String Recipe6 = scanner.next();
        String Recipe7 = scanner.next();
        String Recipe8 = scanner.next();
        String Recipe9 = scanner.next();
        // 별점 정수, 퍼센트 변환
        int intStar = (int)doubleStar;
        int percentStar = intStar * 100  / 5 ;

        // 레시피 출력
        System.out.println("[" + title + "]");
        // 별점 출력
        System.out.println("별점: " + intStar + " (" + percentStar + " %)");
        // 레시피 출력
        System.out.println("1. " + Recipe0);
        System.out.println("2. " + Recipe1);
        System.out.println("3. " + Recipe2);
        System.out.println("4. " + Recipe3);
        System.out.println("5. " + Recipe4);
        System.out.println("6. " + Recipe5);
        System.out.println("7. " + Recipe6);
        System.out.println("8. " + Recipe7);
        System.out.println("9. " + Recipe8);
        System.out.println("10. " + Recipe9);
    }
}
