
public class Array2Test {
    public static void main(String[] args) {
        //배열생성테스트
        //int타입
        int[][] intArr = new int[2][3]; //앞에 값이 열(세로), 뒤에값이 행(가로)
        System.out.print("{" + intArr[0][0] + ",");  //1열 초기값 확인 {0,0,0}
        System.out.print(intArr[0][1] + ",");
        System.out.println(intArr[0][2] + "}");
        System.out.print("{" + intArr[1][0] + ",");  //2열 초기값 확인 {0,0,0}
        System.out.print(intArr[1][1] + ",");
        System.out.println(intArr[1][2] + "}");


        //boolean타입
        boolean[][] booleansArr = new boolean[2][3]; //앞에 값이 열(세로), 뒤에값이 행(가로)
        System.out.print("{" + booleansArr[0][0] + ",");  //1열 초기값 확인 {false,false,false}
        System.out.print(booleansArr[0][1] + ",");
        System.out.println(booleansArr[0][2] + "}");
        System.out.print("{" + booleansArr[1][0] + ",");  //2열 초기값 확인 {false,false,false}
        System.out.print(booleansArr[1][1] + ",");
        System.out.println(booleansArr[1][2] + "}");

        //string타입
        String[][] strArr = new String[2][3]; //앞에 값이 열(세로), 뒤에값이 행(가로)
        System.out.print("{" + strArr[0][0] + ",");  //1열 초기값 확인 {"","",""}
        System.out.print(strArr[0][1] + ",");
        System.out.println(strArr[0][2] + "}");
        System.out.print("{" + strArr[1][0] + ",");  //2열 초기값 확인 {"","",""}
        System.out.print(strArr[1][1] + ",");
        System.out.println(strArr[1][2] + "}");

        //단건 조회
        System.out.println(intArr[1][2]); //인덱스 1열 2행 값을 출력

        //다건 조회
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                System.out.println(i + ", " + j + "=> " + intArr[i][j]);
            }
        }

        //초기화
        for (int x = 0; x < intArr.length; x++) {
            for (int y = 0; y < intArr[x].length; y++) {
                intArr[x][y] = 1;
            }
        }


    }
}