
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
        Test1 t1 = new Test1(10000);
        Test1 t2 = new Test1(10000);


        System.out.println(t1.valueOfSupply);
        System.out.println(t2.valueOfSupply);
        System.out.println(t1.getVAT());
        System.out.println(t2.getVAT());
        System.out.println(t1.getTotal());
        System.out.println(t2.getTotal());




    }

}
