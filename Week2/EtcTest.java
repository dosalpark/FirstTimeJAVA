
public class EtcTest {
    public static void main(String[] args) {
        //기타연산자: 형변환연산자, 삼항연산자, instance of

        //형변환 연산자
        int intNumber = 93 + (int)98.8;
        System.out.println(intNumber);  //93 + 98 = 191

        double doubleNumber = (double)93 + 98.8;
        System.out.println(doubleNumber); //93.0 + 98.8 = 191.8

        System.out.println();

        //삼항연산자: 비교연산자와 항상 함께 쓰인다.
        // [ 조건 ? 참 : 거짓 ]
        int i = 1, j = 9 ;
        boolean flag = ( i == j ) ? true : false;
        System.out.println(flag); //false  조건에 부합하지 않기때문에 뒤에 있는 "false"를 입력

        String str =  ( i!= j ) ? "정답" : "오답";
        System.out.println(str); //정답  i와 j는 같지 않기때문에 앞에 있는 "정답"을 입력

        int min = ( i > j ) ? j : i ;
        System.out.println(min); //min = i(1) j가 더 작기때문에 앞에 있는 i를 min에 입력

        //instance of (이론만 3주차 교육)
        // 피 연산자가 조건에 명시된 클래스의 객체인지 비교하여 맞으면 true, 틀리면 false 입력
    }

    public static class OperatorUDTest {
        public static void main(String[] args) {

        }
    }
}
