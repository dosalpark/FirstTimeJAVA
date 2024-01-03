package Week3.inter;

//Main은 D라는 클래스는 상속받음.
//Main은 C라는 인터페이스 연결해있음.
//public class Main extends D implements C {
//
//    //C라는 인터페이스가 인터페이스 A,B를 상속받아서 아래 a, b도 override
//    @Override
//    public void a() {
//        System.out.println("A");
//    }
//
//    @Override
//    public void b() {
//        System.out.println("B");
//    }
//    //상속받은 D의 내용을 override
//    //d를 호출하면 부모의 d를 불러옴
//    @Override
//    void d() {
//        super.d();
//    }
//
//    public static void main(String[] args) {
//        Main main = new Main();
//        main.a(); //인터페이스 A의 "A"
//        main.b(); //인터페이스 B의 "B"
//        main.d(); //상속받은 D의 "D"
//    }
//}
//
//interface A {
//    void a();
//}
//
//interface B {
//    void b();
//}
//
////인터페이스 C는 인터페이스 A,B를 다중상속받음.
////사용가능: A,B,C
//interface C extends A, B {
//}
//
//class D {
//    void d() {
//        System.out.println("D");
//    }
//}