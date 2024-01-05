package Week4.week4Test;

public class Calculator {
    private int firstNumber;
    private int secondNumber;

    private AbstractOperation operation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    public Calculator() {
    }

    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double calculate() {
        double answer = 0;
        answer = operation.operate(this.firstNumber, this.secondNumber);
        return answer;
    }

}

//public class Calculator {
//    //step1.
////    - Calulator 클래스는 연산을 수행하는 반환타입이 double 인 calculate 메서드를 가지고 있습니다.
////    - calculate 메서드는 String 타입의 operator 매개변수를 통해 연산자 매개값을 받습니다.
////    - int 타입의 firstNumber, secondNumber 매개변수를 통해 피연산자 값을 받습니다.
////    - calculate 메서드는 전달받은 피연산자, 연산자를 사용하여 연산을 수행합니다.
//
//    //step3.
////    AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기) 연산 클래스를을 만든 후
////    클래스간의 관계를 고려하여 Calculator 클래스와 관계를 맺습니다.
////      - 관계를 맺은 후 필요하다면 Calculator 클래스의 내부코드를 변경합니다.
////      - 나머지 연산자(%) 기능은 제외합니다.
////    private final AddOperation addOperation;
////    private final SubstractOpration substractOpration;
////    private final DivideOperation divideOperation;
////    private final MultiplyOperation multiplyOperation;
////
////    public Calculator (AddOperation addOperation,
////                       SubstractOpration substractOpration,
////                       DivideOperation divideOperation,
////                       MultiplyOperation multiplyOperation) {
////        this.addOperation = addOperation;
////        this.substractOpration = substractOpration;
////        this.divideOperation = divideOperation;
////        this.multiplyOperation = multiplyOperation;
////    }
////        public double calculate(String opearation, int firstNumber, int secondNumber){
////        double answer = 0;
////        if (opearation.equals("+")){
////            answer = addOperation.operate(firstNumber,secondNumber);
////        } else if (opearation.equals("-")) {
////            answer = substractOpration.operate(firstNumber, secondNumber);
////        } else if (opearation.equals("*")) {
////            answer = multiplyOperation.operate(firstNumber, secondNumber);
////        } else if (opearation.equals("/")) {
////            answer = divideOperation.operate(firstNumber, secondNumber);
////        }
////        return answer;
////        }
//    //step4.
//    //기존 4개에서 추상화클래스 만들어서 하나만 등록
//    //처음 선언시 추상화로 묶인 4개(+,-,*,/) 중 하나 선언
//    //setter사용하면서 final 제거
//    private AbstractOperation operation;
//    public Calculator (AbstractOperation operation){
//        this.operation = operation;
//    }
//    public void setOperation(AbstractOperation operation) {
//        this.operation = operation;
//    }
//
//    //선언한 값이 있으니 abstractOperation.operate해도 선언한 값으로 계산해서 값을 리턴해옴
//    public double calculate(int firstNumber, int secondNumber){
//        double answer = 0;
//        answer = operation.operate(firstNumber,secondNumber);
//        return answer;
//    }
//
//
////        double answer = 0;
////        if (operator.equals("+")){
////            answer = firstNumber + secondNumber;
////        } else if (operator.equals("-")) {
////            answer = firstNumber - secondNumber;
////        } else if (operator.equals("*")) {
////            answer = firstNumber * secondNumber;
////        } else if (operator.equals("/")) {
////            answer = firstNumber / secondNumber;
////            //step2.
////        } else if (operator.equals("%")) {
////            answer = firstNumber % secondNumber;
////        }
////        return answer;
////    }
//}
