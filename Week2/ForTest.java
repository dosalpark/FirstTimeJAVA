public class ForTest {
    public static void main(String[] args) {
        //for문: 특정조건(초기값, 조건, 증감연산)에 따라 연산을 반복해서 수행해야 할 때 사용.

        System.out.println("I 후위형");
        for ( int i = 0; i < 4; i++ ) {
            System.out.println(i + "번 째 출력");
        }
        System.out.println("J 전위형");
        for ( int j = 0; j < 4; ++j ) {
            System.out.println(j + "번 째 출력");
        }
    }
}
