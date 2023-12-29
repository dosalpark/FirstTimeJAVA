
public class OperatorUDTest {
    public static void main(String[] args) {
        //연산자의 우선순위 : 산술 > 비교 > 논리 > 대입
        int x = 2, y = 9, z = 10;

        boolean result = x < y && y < z;
        System.out.println(result); // 2 < 9 && 9 < 10; 좌우항 true로 result: true

        boolean result1 = x + 10 < y && y < z; // 2 + 9 < 10 && 9 < 10 ;
        System.out.println(result1);           // 11 < 10 && 9 < 10 ; 좌항 false, 우항 true로 result1: false

        boolean result2 = x + 2 * 3 > y ; // 2 + 2 * 3 > 9 ;
        System.out.println(result2);      // 2 + 6 > 9 ;
                                          // 8 > 9 ; 거짓이므로 result2: false

        boolean result3 = ( x + 2 ) * 3 > y;  // ( 2 + 2 ) * 3 > 9 ;
        System.out.println(result3);          // 4 * 3 > 9 ;
                                              // 12 > 9 ; 참이므로 result3: true


    }
}
