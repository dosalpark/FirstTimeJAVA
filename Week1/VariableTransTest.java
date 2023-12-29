public class VariableTransTest {
    public static void main(String[] args) {
        //1. 정수 -> 실수
        int intNumber1 = 10;
        //변환하는 과정에서 정수 10이 실수로 변환되어 10.0이 됨.
        float floatNumber1 = (float)intNumber1;
        System.out.println("1-" + floatNumber1);
        double doubleNumber1 = (double)intNumber1;
        System.out.println("1-" + doubleNumber1);

        //2. 실수 -> 정수
        double doubleNumber2 = 10.10101;
        float floatNumber2 = 1.01010f;
        //변환에 있어서 정수형으로 변경하기 때문에 소숫점 뒤 숫자들이 휘발됨.
        int intNumber2 = (int) doubleNumber2;
        System.out.println("2-" + intNumber2);
        int intNumber3 = (int) floatNumber2;
        System.out.println("2-" + intNumber3);

        //3. 암시적 형변환. 큰 타입에 작은 타입의 값으로 넣을 때 자동 변환.
//        3-1. byte -> int
        byte byteNumber = 10;

        int intNumber4 = byteNumber;
        System.out.println("3.1-" + intNumber4);

//        3-2. char -> int
        char charAlpabet = 'A';
        int intNumber5 = charAlpabet;
        System.out.println("3.2-" + intNumber5);

        //3-3. int -> long
        int intNumber6 = 100;
        long longNumber = intNumber6;
        System.out.println("3.3-" + intNumber6);

        //3-4. int -> double
        int intNumber7 = 200;
        double doubleNumber3 = intNumber7;
        System.out.println("3.4-" + doubleNumber3);

        //4. 작은 타입이 큰 타입과 계산 될 때 큰 타입으로 형변환 되어서 계산 됨.
        int intNumber8 = 10;
        double doubleNumber4 = 5.5;
        double result1 = intNumber8 + doubleNumber4;
        System.out.println("4-" + result1);


    }
}
