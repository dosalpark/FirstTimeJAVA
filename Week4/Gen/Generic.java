package Week4.Gen;

// 1. 제네릭은 클래스 또는 메서드에서 사용 가능.
// <>안에 들어가야할 타입 명시
public class Generic<T> {  //제네릭 클래스
    // 2.
    private T t; //내부필드에 String
    // 3.
    public T get() { //메소드의 리턴타입 String
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        // 4.
        Generic<String> stringGeneric = new Generic<>();
        // 5.
        stringGeneric.set("Hello World");

        String tValueTurnOutWithString = stringGeneric.get();

        System.out.println(tValueTurnOutWithString);
    }
}
