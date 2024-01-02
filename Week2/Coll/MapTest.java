import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        //Map: 순서가 없는(key - value) 쌍으로 이루어진 데이터의 집합(Key값 중복을 허용하지않음)
        //key 값은 unique 하게 보장 되어야 함.
        //HashMap, TreeMap으로 응용해서 사용 가능.

        //1. Map 생성
        Map<String, Integer> intMap = new HashMap<>();
        //2. 키값 입력
        intMap.put("일", 1);
        intMap.put("이", 2);
        intMap.put("삼", 3);
        intMap.put("사", 4); //중복 key 값
        intMap.put("사", 5); //중복 key 값
        //3. 값 출력
        //key 조회시 중복된 값은 하나만 출력
        //value 조회시 중복된 값은 마지막에 입력된 값으로 출력
        for ( String key : intMap.keySet() ){ //key 출력
            System.out.println(key);
        }
        for ( Integer value : intMap.values() ){ //value 출력
            System.out.println(value);
        }
        //4. 키값으로 value값 조회
        System.out.println(intMap.get("이")); //해당하는 값인 value값 2 출력
        System.out.println(intMap.get("사")); //해당하는값 4,5 두개 중 나중에 입력된 5를 출력
        //5. 값 삭제
        intMap.remove("사");//remove 안에 해당하는 key값을 입력
        System.out.println(intMap.get("사"));//삭제 후 값 없어서 null 출력
        //6. 값 모두 삭제
        intMap.clear();
        System.out.println(intMap.size()); //모두 삭제 후 값 0
    }
}
