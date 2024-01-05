package Study;

public class InherintanceApp {
    public static void main(String[] args) {
        Cal cal = new Cal(2,1);
        System.out.println(cal.v1); // 2
        System.out.println(cal.v2); //3
        System.out.println(cal.sum());

        Cal3 cal3 = new Cal3(4,5);
        System.out.println(cal3.sum());
    }
}
