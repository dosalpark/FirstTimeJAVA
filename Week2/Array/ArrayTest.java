public class ArrayTest {
    public static void main(String[] args) {
        //배열생성테스트
        //int타입
        int[] intArr = new int[3]; //0,1,2번 정수 칸 생성
        System.out.print("{" + intArr[0] + ",");  //초기값 확인 {0,0,0}
        System.out.print(intArr[1] + ",");
        System.out.println(intArr[2] + "}");

        //boolean타입
        boolean[] booleansArr = new boolean[3]; //0,1,2번 불리언 칸 생성
        System.out.print("{" + booleansArr[0] + ",");  //초기값 확인 {false,false,false}
        System.out.print(booleansArr[1] + ",");
        System.out.println(booleansArr[2] + "}");

        //string타입
        String[] strArr = new String[3]; //0,1,2번 문자열 칸 생성
        System.out.print("{" + strArr[0] + ",");  //초기값 확인 {"","",""}
        System.out.print(strArr[1] + ",");
        System.out.println(strArr[2] + "}");

        //단건 조회
        System.out.println(intArr[1]); //인덱스 0,1,2중에 1번 값을 출력

        //다건 조회
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }
}
