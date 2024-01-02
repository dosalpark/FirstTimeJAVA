import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        //List: 순서가 있는 데이터의 집합. 초기에 길이를 몰라도 생성 가능
        //주요사용: add, set, remove, clear
        //Array(정적배열) - 초기에 메모리 길이를 받아서 생성함.
        //List(동적배열) - 크기가 가변적으로 늘어남, 생성 시점에 작은 연속된 공간을 요청해서 참조형 변수를 담아놓음

        //1. List 생성
        ArrayList<Integer> intList = new ArrayList<Integer>();
        //2. 값 입력
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(2, 4);  //2번자리에 4라는 값을 추가. (1, 2, 3) -> (1, 2, 4, 3)
        //3. 값 출력
        System.out.println(intList.get(0));
        System.out.println(intList.get(1));
        System.out.println(intList.get(2));
        System.out.println(intList.get(3));
        System.out.println(intList.toString()); //모든 값 출력
        //4. 값 수정
        intList.set(1, 20); //앞은 0부터 시작, 현재는 값이 2인 배열 수정
        System.out.println(intList.get(1));
        //5. 값 삭제
        System.out.println(intList.get(0)); // 1번 값 0
        intList.remove(0);
        System.out.println(intList.get(0)); // 1번 값 0 이 삭제되서 1값이 1번이됨.
        //6. 값 모두 삭제
        intList.clear();
        System.out.println(intList.toString());
    }
}
