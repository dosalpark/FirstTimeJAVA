//Accounting
public class Test1{
    double valueOfSupply;
    //vatRate는 변하지 않는 값이라 static 처리해서 참조만 함
    static double vatRate = 0.1;

    //인스턴스 생성시 valueOfSupply 값 지정해서 생성.
    public Test1(double valueOfSupply){
        this.valueOfSupply = valueOfSupply;
        System.out.println("생성테스트");
    }
    //getVAT, getTotal 계산해서 인스턴스로 전달
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}



