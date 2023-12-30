public class UForText {
    public static void main(String[] args) {
        //향상된 for문: 배열을 이용해서 변수에 배열에 들어있는 값을 순차적으로 입력
        int[] numbers = {3, 5, 7, 9, 11, 13, 15};

        System.out.println("향상된 for문으로 작성");
        for ( int number: numbers ) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("일반 for문으로 작성");
        for ( int number2 = 0; number2 < numbers.length; number2++ ) {
            System.out.print(numbers[number2] + " ");
        }
    }
}
