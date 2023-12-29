
public class BitTest {
    public static void main(String[] args) {
        //비트연산: <<, >>
        //자릿수를 왼쪽으로 옮기는 횟수만큼 2의 배수로 곱셉이 연산 됨.
        //자릿수를 오른쪽으로 옮기는 횟수만큼 2의 배수로 나눗셈이 연산 됨.
        System.out.println( 3 << 2 ); //12,  3은 이진수로 0011 << 2 니까 1100이 됨. 10진수로는 12
        System.out.println( 3 << 1 ); //6,   위와 동일하게 0011 << 1 이니까 0110 이됨. 10진수로는 6

        System.out.println( 13 >> 2 ); // 3, 13은 이진수로 1101 >> 2 니까 0011이 됨. 10진수로는 3
        System.out.println( 13 >> 1 ); // 6, 위와 동일하게 1101 > 1 이니까 0110이 됨. 10진수로는 6
    }
}
