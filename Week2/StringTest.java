
public class StringTest {
    public static void main(String[] args) {
        //String 기능 활용
        String str = "ABCDE";

        //1. length - str의 길이 확인
        int strLength = str.length();
        System.out.println(strLength); //5

        //2. charAt - ()에 있는 자리에 해당하는 문자를 호출
        char strChar = str.charAt(1);
        System.out.println(strChar); //B

        //3. subString (int fromIdx, int toIdx) - 원하는 자리만큼만 잘라서 가져옴
        String strSub = str.substring(0,3);
        System.out.println(strSub);  //(0,3) 0부터 3전(2)까지: ABC

        //4. equals(String str) - 다른 값과 동일한지 확인, true/false로 값 반환
        String newStr = "ABCDE";
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual); //두 문자열다 "ABCDE"기 때문에 ture

        //5. toCharArray() - String을 char[]로 변환
        char[] strCharArray = str.toCharArray();
        System.out.println(strCharArray[2]); //str 문자열에 index 3번에 해당하는 C

        //6. new String(char 배열 변수명)- char[]를 String으로 변환
        char[] charArray = {'A','B','C'};
        String charArrayString = new String(charArray);
        System.out.println(charArrayString);
    }

}
