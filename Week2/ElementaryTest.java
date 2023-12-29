public class ElementaryTest {
    public static void main(String[] args) {
        //사칙연산:  +, -, * ,/ ,%
        //다른 두 피연산자의 연산시 저장공간이 더 큰 타입으로 일치시킨다.
        System.out.println( 4 + 2 ); // 6
        System.out.println( 4 - 2 ); // 2
        System.out.println( 4 * 2 ); // 8
        System.out.println( 4 / 2 ); // 2
        System.out.println( 4 % 2 ); // 0
        System.out.println( 5 % 2 ); // 1

        System.out.println();

        //우선순위 연산
        System.out.println( 4 + 2 * 2 ); // 8
        System.out.println((4 + 2) * 2); // 12
        System.out.println(4 + (2 * 2)); // 8

        System.out.println();

        //변수를 이용한 연산
        int a = 40, b = 30;
        int sum;
        System.out.println("a는 " + a + " 이고, b는 " + b + "이다.");

        //덧셈
        sum = a + b;
        System.out.println("a + b = " + sum);
        //뺄셈
        sum = a - b;
        System.out.println("a - b = " + sum);
        //곱셈
        sum = a * b;
        System.out.println("a * b = " + sum);
        //나눗셈
        sum = a / b;
        System.out.println("a / b = " + sum);
        //나머지
        sum = a % b;
        System.out.println("a % b = " + sum);
    }
}
