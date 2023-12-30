
public class DoWhileTest {
    public static void main(String[] args) {
        //do while문: do 안에 있는 내용은 한 번 수행하고 while(조건) 에 따라서 추가적으로 수행
        // 처음 number 4 출력 이후 조건식(!(number == 0)); 에 따라 반복수행 --number가 0일때 까지 반복
        int number = 4;
        do {
            System.out.println(number + "출력!");
            number--;
        } while(!(number == 0));
    }
}
