public class MaxArrayTest {
    public static void main(String[] args) {
        //예제1) 최댓값 구하기
        int[] intArr = {3, 5, 8, 1, 3, 0}; //배열 intArr에 6개 값 존재

        int max = intArr[0]; //max에 배열 첫번째 값을 입력

        for (int i: intArr) {   //i에 intArr 배열의 값을 순차적으로 대입
            if ( max < i ){   //max값보다 i값이 크면 i값을 max에 대입하게 설정
                max = i;
            }
        }
        System.out.println("intArr 배열의 최대값은 " + max + "입니다!");

        //예제2) 최소값 구하기
        int min = intArr[0];  //동일하게 min에 배열 첫번째 값 입력

        for (int j: intArr) { //j에 intArr배열 순차적으로 대입
            if (j < min) {  //min값이 j값보다 크면 min에 j를 대입
                min = j;
            }
        }
        System.out.println("intArr 배열의 최소값은 " + min + "입니다!");
    }
}
