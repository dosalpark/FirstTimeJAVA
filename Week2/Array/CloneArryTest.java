public class CloneArryTest {
    public static void main(String[] args) {
        //얕은 복사: 주소값만 복사되고 실제값은 1개로 유지되는걸 얕은 복사

        int[] a = {1, 2, 3, 4};
        int[] b = a; //얕은 복사 진행

        b[0] = 3;
        System.out.println(a[0]); //a[0] 값도 3으로 변경됨.

        //깊은 복사: 2번재 열에서 new int를 생성함으로서 주소값이 a, b 나뉘어지고 그 후에 b[i] = a[i] 가 진행되서 a값에 변동이 없음.
        int[] c = {1, 2, 3, 4};
        int[] d = new int[c.length]; //배열 a와 같은 값으로 b 배열을 '새로'생성

        for ( int i = 0; i < a.length; i++ ){
            d[i] = c[i];  //깊은 복사
        }

        d[0] = 3;
        System.out.println(c[0]); //a[0]은 그대로 1 유지
    }
}
