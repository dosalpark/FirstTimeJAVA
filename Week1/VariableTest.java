import java.util.Arrays;

public class VariableTest {
    public static void main(String[] args) {
        //우리의 playground!

        //1. 논리형
        boolean flag;
        flag = true;
        System.out.println(flag);
        flag = false;
        System.out.println(flag);

        //2. 문자열
        char alpabet;
        alpabet = 'A';
        System.out.println(alpabet);

        //3. 정수형
        byte bytenumber = 127; // -128 ~ 127(1byte)
        System.out.println(bytenumber);
        short shortnumber = 32767; // -32,768 ~ 32,767(4byte)
        System.out.println(shortnumber);
        int intnumber = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (8byte)
        System.out.println(intnumber);
        long longnumber = 2147483647L; // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (16byte)
        System.out.println(longnumber);

        //4. 실수형
        float floatNumber = 0.121231231233F;  // 정확도 7자리, 4byte
        System.out.println(floatNumber);
        double doubleNumber = 0.12345642132;  // 정확도 15자리, 8byte
        System.out.println(doubleNumber);

        //5. 참조형
        //5-1. 문자열 변수
        String helloWorld = "Hello World!";
        System.out.println(helloWorld);

        //5-2. 배열
        int [] a = {1,2,3}; // [I@682a0b20, [1,2,3]: Arrays.toString 으로 문자형으로 변환해서 가져옴.
        System.out.println(a);
        System.out.println(Arrays.toString(a));

        //6. Wrapper Class
        int number = 21;
        // Integer num = new Integer(number); : 형식 지원종료 예정. 아래처럼 기재
        Integer num = number;   // wrap
        System.out.println(num.intValue()); // unwrap

    }
}
