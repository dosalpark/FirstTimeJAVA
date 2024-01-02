import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        //Stack: 먼저 들어간 데이터가 마지막에 나오는 집합 (FILO)
        //주요사용: push, peek, pop

        //1. Stack 생성
        Stack<Integer> intStack = new Stack<Integer>();
        //2. 값 입력
        intStack.push(10);
        intStack.push(15);
        intStack.push(20);
        //3. 값 꺼내기
        // isEmpty <- 비어있으면 true, 들어있으면 false
        //pop을 이용해서 바스켓에서 마지막에 들어간 순서로 뺌
        while(!intStack.isEmpty()){
            System.out.println(intStack.pop());
        }
        //4-1. 값 재입력
        intStack.push(10);
        intStack.push(15);
        intStack.push(20);
        //4-2. 값 조회
        System.out.println(intStack.peek()); //마지막에 입력된 값 조회
        System.out.println(intStack.size()); //스택에 들어있는 값 갯수 조회
        //5. 값 삭제
        intStack.remove(0);
        System.out.println(intStack.size()); //0번 인덱스 삭제로 값 갯수 2
        //6. 값 모두 삭제
        intStack.clear();
        System.out.println(intStack.size()); //모두 삭제 후 값: 0
    }
}
