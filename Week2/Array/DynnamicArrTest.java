
public class DynnamicArrTest {
    public static void main(String[] args) {
        //가변배열
        //2차원배열 생성시 1차원 배열만 2개 생성하고 뒷 배열은 공란으로 생성
        int[][] array = new int[2][];

        //위에서 생성한 2차원 배열 2개에서 각기 다른 크기로 배열생성
        //  [{0,0}, {0,1}]
        //  [{1,0}, {1,1}, {1,2}, {1,3}
        array[0] = new int[2];
        array[1] = new int[4];

        //처음부터 값을 넣으면서 가변배열 생성 가능
        int[][] array2 = {
                {10, 20},
                {10, 20, 30, 40}
        };
        System.out.println(array2[1][2]); //인덱스 1열 2행값 출력
    }
}
