
//AccountingApp
//장사하는데 장사할때마다 물건값의 부가세를 받는
public class test2 {
//    // 공급가액
//    public static double valueOfSupply;
//    // 부가가치세율
//    public static double vatRate = 0.1;
//
//    public static double getVAT() {
//        return valueOfSupply * vatRate;
//    }
//
//    public static double getTotal() {
//        return valueOfSupply + getVAT();
//    }

    public static void main(String[] args) {
        //인스턴트 t1, t2 생성
        Test1 t1 = new Test1(100); // 생성테스트
        Test1 t2 = new Test1(200); // 생성테스트

        //t1, t2 공급가액
        System.out.println(t1.valueOfSupply); //100.0
        System.out.println(t2.valueOfSupply); //200.0

        //t1, t2 부가세 금액
        System.out.println(t1.getVAT()); //10.0
        System.out.println(t2.getVAT()); //20.0
        //t1, t2 공급가액+부가세액 합
        System.out.println(t1.getTotal()); //110.0
        System.out.println(t2.getTotal()); //220.0
    }

}
