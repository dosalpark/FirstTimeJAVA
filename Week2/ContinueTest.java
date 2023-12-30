public class ContinueTest {
    public static void main(String[] args) {
        //continue문: 만나면 다음 반복문으로 진행 (하위진행은 무시)
        //1~10 사이 홀수의 합
        int number = 0, sum = 0;
        while (number < 10) {
            number ++;
            if (number%2 == 0){
                continue;           //짝수일 경우 바로 while문 다시 실행
            }
            System.out.print(number + " "); //홀수일 경우 number를 출력하고 sum에 number값을 합산
            sum += number;
        }
        System.out.println("\n" +  "1~10사이 홀수의 합:" + sum); //while문이 실행 다 된 뒤 sum을 출력
    }
}
