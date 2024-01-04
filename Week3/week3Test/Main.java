package Week3.week3Test;

public class Main {
    public static void main(String[] args) {
        //Calculator 생성 후
//        Calculator calculator = new Calculator();
        //
        Calculator calculator = new Calculator(new AddOperation());

        System.out.println(calculator.operator(3,4));
        //앞에 calculator는 변수, 뒤에 calcul은 Calculator.java 안에 있는 메서드! 해당 메서드는 (string, int, int)를 받아서 double로 반환함.
        //이렇게 하면 calculate매서드에는 return값만 반환해서 확인 불가능
        //calculator.calculate("*",10,20);

//        System.out.println(calculator.calcul("*",10,20)); //200 정상
//        System.out.println(calculator.calcul("-",10,20)); //-10 정상
//        System.out.println(calculator.calcul("+",10,20)); //30 정상
//        System.out.println(calculator.calcul("/",10,20)); //0 정상
        //step2 나머지 추가 확인(%) //stpe3 다시 주석처리
//        System.out.println(calculator.calcul("%",10,20)); //10 정상
    }
}