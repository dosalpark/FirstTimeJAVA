package Week3.week3Test;

import Study.Cal;

public class Main {
    public static void main(String[] args) {
//        //step1.
//        System.out.println(Calculator.calculate("+",50,30));
//        System.out.println(Calculator.calculate("-",50,30));
//        System.out.println(Calculator.calculate("*",50,30));
//        System.out.println(Calculator.calculate("/",50,30));
//        //step2.
//        System.out.println(Calculator.calculate("+",50,30));
        //step3.
//        Calculator calculator = new Calculator(new AddOperation(), new SubstractOpration(), new DivideOperation(), new MultiplyOperation());
//        System.out.println(calculator.calculate("+",1,5));
//        System.out.println(calculator.calculate("-",1,5));
//        System.out.println(calculator.calculate("*",1,5));
//        System.out.println(calculator.calculate("/",1,5));
//        step4.
        Calculator calculator = new Calculator(new AddOperation());
        System.out.println(calculator.calculate(1,3));
        Calculator calculator1 = new Calculator(new SubstractOpration());
        System.out.println(calculator1.calculate(1,3));
        Calculator calculator2 = new Calculator(new MultiplyOperation());
        System.out.println(calculator2.calculate(1,3));
        Calculator calculator3 = new Calculator(new DivideOperation());
        System.out.println(calculator3.calculate(1,3));



    }
}