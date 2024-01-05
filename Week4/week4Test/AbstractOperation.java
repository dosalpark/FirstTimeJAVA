package Week4.week4Test;

public abstract class AbstractOperation {
//        step4.
//        AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기) 연산 클래스들을
//        AbstractOperation(추상 클래스)를 사용하여 추상화하고 Calculator 클래스의 내부 코드를 변경합니다.
    public abstract double operate(int firstNumber, int secondNumber);
}