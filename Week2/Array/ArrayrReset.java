import java.util.Arrays;

public class ArrayrReset {
    public static void main(String[] args) {
        //배열의 초기화
        //1. 특정값으로 대입해서 입력
        int[] intArr = {1,2,3,4,5};
        String[] strArr = {"A","B","C","D","E"};
        boolean[] booleansArr = {true,false,true,true,false};

        System.out.println("===========================================");

        //2. for문을 이용해서 입력 후 조회
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
            System.out.println(intArr[i]);
        }

        System.out.println("===========================================");

        //2-1. 향상된 for문을 이용해서 조회
        for (int j: intArr) {
            System.out.println(j);
        }

        System.out.println("===========================================");

        //3. 배열의 주소를 모두 같은 값으로 초기화 (class호출 필요)
        Arrays.fill(intArr, 1);
        for (int x: intArr) {
            System.out.println(x);
        }

//        배열이랑 같은 값 말고 다른값으로 테스트  //0, 10, 20, 30, 40 들어감.
//        for (int i = 0; i < ((int)intArr.length * 10); i=i+10) {
//            intArr[i/10] = i;
//            System.out.println(intArr[i/10]);
//        }
    }
}
