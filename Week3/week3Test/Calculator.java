package Week3.week3Test;

public class Calculator {
    private final AbstractOperation abstractOperation;

    public Calculator(AbstractOperation abstractOperation) {
        this.abstractOperation = abstractOperation;
    }


    // void -> 반환타입 double 설정 , String타입의 operator를 받고, inttype의 firstNumber, secondNumber를 받음
    public double operator(int firstNumber, int secondNumber) {
        //답을 받을 변수 선언
        double answer = 0;
        answer = abstractOperation.operate(firstNumber,secondNumber);
//        if (operator.equals("+")) {
//            answer = addOperation.add(firstNumber, secondNumber);
//        } else if (operator.equals("-")) {
//            answer = substractOpration.sub(firstNumber, secondNumber);
//        } else if (operator.equals("*")) {
//            answer = multiplyOperation.mul(firstNumber, secondNumber);
//        } else if (operator.equals("/")) {
//            answer = divideOperation.div(firstNumber, secondNumber);
//            //step2. 나머지 추가 (%) //step3. 다시 주석처리
////        } else if (operator.equals("%")) {
////            answer = firstNumber % secondNumber;
//        } else {
//            System.out.println("연산자를 제대로 입력해주세요.");
//        }
        return answer;
    }
}