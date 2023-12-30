public class ArryQAT {
    public static void main(String[] args) {

        //Q.향상된 for문을 이용해서 배열 입력시 println 없이도 값이 입력되는지 궁금증
        //A. 향상된 for문을 이용해서 배열 값 입력은 안되는거였다...



        //기존 int타입 배열 초기화
        int arr[] = {1,3,5,7,9};
        System.out.println(arr[2]); //int타입 arr배열에 인덱스 3번에 해당하는 값 호출 : 5
        System.out.println("===========================================");

        //테스트를 위한 arr2 배열생성 (초기화x)
        int arr2[] = new int[5]; //새로운 int타입 arr2배열 생성. 값은 입력해주지 않아서 0일걸로 예상
        System.out.println(arr2[1]); //int타입 arr2배열에 인덱스 2번에 해당하는 값 호출 : 0 예측성공
        System.out.println("===========================================");

        //arr2 배열 향상된 for문으로 입력 테스트 (for문 안에 아무것도 입력안함.) : print해도 아무 값도 없음.
        for ( int i : arr2 ){
        }
        System.out.println(arr2[1]); //가정이 맞다면 1이 입력될것이라고 생각했는데 입력되지 않음.
        System.out.println("===========================================");

        //arr2 배열 향상된 for문으로 입력 테스트2 (println(j)
        for ( int j : arr2 ){
            System.out.println(j);
        }
        System.out.println(arr2[1]); //이렇게 해도 입력되지 않음.
        System.out.println("===========================================");

        //테스트를 위한 arr3 배열생성 (초기화x)
        int arr3[] = new int[5]; //새로운 int타입 arr3배열 생성. 값은 입력해주지 않아서 0일걸로 예상
        System.out.println(arr3[3]); //int타입 arr3배열에 인덱스 2번에 해당하는 값 호출 : 0 예측성공
        System.out.println("===========================================");

        //arr3 향상된 for 조건식 앞부분에 ++ 기재해서 입력 테스트1 (for문 안에 아무것도 입력안함.) //에러발생
//        for (int x++ : arr3) {
//        }

        //arr3 배열 향상된 for문으로 입력 테스트2 (println(j)
        for (int y: arr3){
            System.out.println(y);
        }
        System.out.println(arr3[3]);
    }
}
