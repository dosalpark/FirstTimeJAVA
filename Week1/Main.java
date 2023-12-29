//main 클래스
//public: 제어자, 메인 클래스를 어떻게 제어할껀지, public은 src안에서 어디서든 접근이 가능하다.
public class Main {


    //main메소드 JAVA프로젝트는 제일 먼저 클래스의 main 메소드를 실행시킨다.
    // = JVM의 약속

    //static: 이 프로그램이 시작될 때 무조건 실행되는 놈
    //void: 메소드의 출력 데이터 타입, 아무것도 없다 > 출력은 없다. (데이터 타입을 기재하면 출력이 해당 데이터타입으로 제한됨.)
    //String[] args: 매개변수 자리, 인풋자리 args는 변수명이기때문에 아무거나 작성해도 상관없음.
    public static void main(String[] args) {


        //객체: 특징(변수, 속성)과 행동(메소드)을 가지고 있음.
        //out: 객체, println: 메소드, System: 클래스
        System.out.println(7);
        System.out.println(3);
        System.out.println(3.14);
        System.out.println("JAVA");

    }
}
