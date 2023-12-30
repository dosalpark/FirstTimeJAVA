public class WhileTest {
    public static void main(String[] args) {
        //while문: 조건에 만족하면 계속 반복됨. 실행되는 내용 안에 증감식이 들어가야 함.
        int number = 0;
        while ( number < 3 ) {
            number++;
            System.out.println("number: "+ number);
        }
    }
}
