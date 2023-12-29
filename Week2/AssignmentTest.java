public class AssignmentTest {
    public static void main(String[] args) {
        //대입연산자: =, +=, -=, *=, /=, ..  (변수를 연산해서 그 자리에서 저장하는(대입) 연산자)

        //기본 대입연산자: 계산 후 왼쪽 number에 대입
        int number = 10;
        number = number + 2;
        System.out.println(number);
        number = 10;
        number = number -2;
        System.out.println(number);
        number = 10;
        number = number * 2;
        System.out.println(number);
        number = 10;
        number = number / 2;
        System.out.println(number);
        number = 10;
        number = number % 2;
        System.out.println(number);

        System.out.println("위와 아래의 식은 동일한 내용이다.");

        //복합 대입연산자
        number = 10;
        number += 2;
        System.out.println(number);
        number = 10;
        number -= 2;
        System.out.println(number);
        number = 10;
        number *= 2;
        System.out.println(number);
        number = 10;
        number /= 2;
        System.out.println(number);
        number = 10;
        number %= 2;
        System.out.println(number);

        System.out.println("간편식 =================");

        //간편식 ++, --
        // number ++; = [number = number + 1 ;] ,  number --; = [ number = number - 1 ;]
        number = 10;
        number ++;
        System.out.println(number);
        number = 10;
        number --;
        System.out.println(number);

        //전위형(++ number;) 후위형(number ++;)
        //참조되기 전에 값이 증가됨, 참조가 되고나서 값이 증가됨. 사용시 주의
    }
}
