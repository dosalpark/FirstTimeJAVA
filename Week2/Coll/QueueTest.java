import java.util.LinkedList;
import java.util.Queue;


public class QueueTest {
    public static void main(String[] args) {
        //Queue: 데이터가 들어간 순서대로 데이터를 뺄 수 있는 집합 (FIFO)
        //생성자가 없는 인터페이스?
        //주요사용: add, peek, poll

        //1. Queue 생성
        Queue<Integer> intQueue = new LinkedList<>();
        //2. 값 입력
        intQueue.add(1);
        intQueue.add(3);
        intQueue.add(5);
        //3. 값 꺼내기
        //들어간 순서대로 나옴
        while(!intQueue.isEmpty()){
            System.out.println(intQueue.poll());
        }
        //4-1. 값 재입력
        intQueue.add(1);
        intQueue.add(3);
        intQueue.add(5);
        //4-2. 값 조회
        System.out.println(intQueue.peek()); //처음 들어간 값 조회
        System.out.println(intQueue.size()); //큐에 들어있는 값 갯수 조회
        //5. 값 삭제
        //큐는 index를 입력하는게 아닌 값을 입력해야 하는것으로 보임
        intQueue.remove(1);
        System.out.println(intQueue.size()); //1번 값 삭제로: 2
        //5. 값 모두 삭제
        intQueue.clear();
        System.out.println(intQueue.size()); //모두 삭제로 0
    }
}
