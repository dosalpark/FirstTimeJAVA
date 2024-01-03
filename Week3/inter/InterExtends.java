package Week3.inter;

public class InterExtends {
    public static void main(String[] args) {


//       class B implements A {
//          @Override
//           public void a() {
//               System.out.println("B.a()");  //1
//          }
//
//           public void b() {
//                System.out.println("B.b()"); //2
//           }
//      }

        // A 인터페이스에 구현체 B 대입
        //a1은 인터페이스 A 타입이기 때문에 A가 가지고있는아래부분만 사용 가능 ->a() 위의주석  1번
        A a1 = new B();
        a1.a();
        // a1.b(); // 불가능

        // B 인터페이스로 변경되어서 위에서 사용하지 못했던 위의 주석 2번 사용가능.
        System.out.println("\nB 강제 타입변환");
        B b = (B) a1;
        b.a();
        b.b(); // 강제 타입변환으로 사용 가능
        System.out.println();

        // A 인터페이스에 구편체 B를 상속받은 C 대입
        // 원래 C는 a(), b(), c() 모두 사용 할 수 있지만 A로 자동 형변환되어 A가 가지고있는 a()만 사용가능..
        A a2 = new C();
        a2.a();
        //a2.b(); // 불가능
        //a2.c(); // 불가능

        System.out.println("\nC 강제 타입변환");
        // C로 강제 타입변환으로 인터페이스 B가 가지고있던 b(), 인터페이스 A에게서 상속받아온 a(), 부모테이블인 B로 에서 상속받아온 c() 까지 모두 사용가능
        C c = (C) a2;
        c.a();
        c.b(); // 강제 타입변환으로 사용 가능
        c.c(); // 강제 타입변환으로 사용 가능


    }
}

interface A {
    void a();
}
class B implements A {
    @Override
    public void a() {
        System.out.println("B.a()");
    }

    public void b() {
        System.out.println("B.b()");
    }
}
class C extends B {
    public void c() {
        System.out.println("C.c()");
    }
}




