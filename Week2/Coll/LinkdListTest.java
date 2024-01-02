import java.util.LinkedList;

public class LinkdListTest {
    public static void main(String[] args) {
        //linked list: 메모리에 남는 공간을 요청해서 나눠서 실제 값을 담아놓음.
        //주요사용: add, set, remove, clear
        // 실제 값이 있는 주소값으로 목록을 구성하고 저장하는 자료구조
        //기능은 ArrayList와 동일하나 조회하는 속도가 느리고, 추가 및 삭제는 빠르다.

        //1. LinkedList 생성
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        //2. 값 입력
        linkedList.add(11);
        linkedList.add(22);
        linkedList.add(33);
        linkedList.add(1, 16);
        //3. 값 조회
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));
        System.out.println(linkedList.toString());
        //4. 값 수정
        linkedList.set(0, 6);
        System.out.println(linkedList.get(0));
        //5. 값 삭제.
        linkedList.remove(2);
        System.out.println(linkedList.toString());
        //6. 값 모두 삭제
        linkedList.clear();
        System.out.println(linkedList.toString());
    }
}
