//Accounting
public class Test1{
    double valueOfSupply;
    final static double vatRate = 0.1;

    public Test1(double valueOfSupply){
        this.valueOfSupply = valueOfSupply;
        System.out.println("생성테스트");
    }
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
    public double getTotal() {
        return valueOfSupply * getVAT();
    }
}



