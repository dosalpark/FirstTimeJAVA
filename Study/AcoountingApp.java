
package Study;
public class AcoountingApp {
    public static double valueOfSupply = 1000.0;
    public static double vatRate = 0.1;
    public static void main(String[] args) {
        System.out.println(getVat());
        gettotal();
    }

    public static double getVat (){
        return valueOfSupply + vatRate;
    }

    public static Double gettotal(){
        return valueOfSupply + getVat();
    }
}

