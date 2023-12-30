import java.util.Arrays; //copyOf 사용시 Arrays 클래스 import 됨.
public class CopyOfArrTest {
    public static void main(String[] args) {
        // Arrays.copyOf() 메소드
        int[] a = {1, 2, 3, 4};
        int[] b = Arrays.copyOf(a, a.length); //배열생성 과 함께 length값 같이 복사됨.

        a[3] = 0;
        System.out.println(a[3]);  //바로 위에서 0으로 변경
        System.out.println(b[3]); //깊은 복사이기 때문에 생성될때 값인 4로 유지

        //clone 메소드  **1차원 배열에서만 깊은복사로 진행되고, 2차원 이상은 메소드를 사용해도 얕은복사로 복사
        int[] c = {1, 2, 3, 4};
        int[] d = c.clone();

        c[2] = 0;
        System.out.println(c[2]); // 바로 위에서 0으로 변경
        System.out.println(d[2]); // 깊은 복사이기 때문에 쌩성될때 값인 3으로 유지
    }
}
