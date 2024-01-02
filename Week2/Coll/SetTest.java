import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        //Set: 순서가 없는 데이터의 집합(데이터 중복을 허용하지않음) - 순서없고 중복없는 배열
        //HashSet, TreeSet 등으로 응용해서 같이 사용 가능.
        //Set은 생성자가 없는 껍데기라서 바로 생성할 수 없음(?)
        //생성자가 존재하는 HashSet을 이용해서 테스트

        //1. Set 생성
        Set<Integer> intSet = new HashSet<Integer>();
        //2. 값 입력
        intSet.add(3);
        intSet.add(9);
        intSet.add(6);
        intSet.add(12);
        intSet.add(3);
        //3-1. 값 출력
        //value에 위에 입력된 값들이 들어가면서 for문 실행됨.
        //중복된 값은 출력되지 않아서 4개(3,6,9,12) 만 출력됨
        for ( Integer value: intSet ) {
            System.out.println(value);
        }
        //3-2. 값 포함 여부 출력
        System.out.println(intSet.contains(5)); //5를 포함하는지 확인: false(5가 없으므로)
        System.out.println(intSet.contains(3)); //3를 포함하는지 확인: ture
        //4. 값 삭제
        intSet.remove(3);
        System.out.println(intSet.size()); //값:3 삭제로 남아있는건 3개
        //5. 값 모두 삭제
        intSet.clear();
        System.out.println(intSet.size()); //값 모두 삭제로 0
    }
}
