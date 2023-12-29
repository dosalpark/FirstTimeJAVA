public class LogicalTest {
    public static void main(String[] args) {
        //논리연산자: &&, ||, !
        //조건을 연결 하였을때 boolean 값들을 조합하여 boolean 값을 출력
        boolean flag1 = true;
        boolean flag2 = false;
        boolean flag3 = true;

        System.out.println("flag1은" + flag1 + "이며, flag2는 " + flag2 + "이고, flag3은 " + flag3 + "이다.");

        System.out.println("|| start===========");

        //OR(||): 피 연산자 중 하나라도 true이면 ture
        System.out.println(flag1 || flag2); //true
        System.out.println(flag1 || flag3); //true
        System.out.println(flag2 || flag3); //ture
        System.out.println(flag1 || flag2 || flag3); //true
        System.out.println((5 > 3) || (3 > 1)); // true || true  = true
        System.out.println((5 > 3) || (3 < 1)); // true || false = true

        System.out.println("&& start===========");

        //AND(&&): 피 연산자가 모두 true이면 ture
        System.out.println(flag1 && flag2); //false
        System.out.println(flag1 && flag3); //true
        System.out.println(flag2 && flag3); //false
        System.out.println(flag1 && flag2 && flag3); //false
        System.out.println((5 > 3) && (3 > 1)); // true && true = true
        System.out.println((5 > 3) && (3 < 1)); // true && false = false

        System.out.println("! start===========");

        //NOT(!): 논리 부정 연산자. 값을 반대로 돌림
        System.out.println(!flag1); //false
        System.out.println(!(5 == 5)); //false
        System.out.println(!(5 == 3)); //true
    }
}
