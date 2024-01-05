package Week4.week4Test;

import java.lang.reflect.Parameter;
import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws BadInputException {
        // 구현 1. 8줄에 숫자값이 아닐때 정수값을 달라고 BadInputException에 전달. 정상이면 값 리턴
        if (!Pattern.matches(NUMBER_REG,firstInput)) {
            throw new BadInputException("정수값");
        }
        this.calculator.setFirstNumber(Integer.parseInt(firstInput));

        return this;
    }


    public Parser parseSecondNum(String secondInput) throws BadInputException {
        // 구현 1. 8줄에 숫자값이 아닐때 정수값을 달라고 BadInputException에 전달. 정상이면 값 리턴
        if (!Pattern.matches(NUMBER_REG, secondInput)) {
            throw new BadInputException("정수값");
        }
        this.calculator.setSecondNumber(Integer.parseInt(secondInput));

        return this;
    }

    public Parser parseOperator(String operationInput) throws BadInputException {
        // 구현 1. 10줄에 연산자 값이 아닐때 BadInputException에 연산자달라고 전달. 정상이면 아래 연산자 부여
        if (!Pattern.matches(OPERATION_REG, operationInput)) {
            throw new BadInputException("연산자");
        }
        switch (operationInput) {
            case "+" :
                this.calculator.setOperation(new AddOperation());
                break;
            case "-" :
                this.calculator.setOperation(new SubstractOperation());
                break;
            case "*" :
                this.calculator.setOperation(new MultiplyOperation());
                break;
            case "/" :
                this.calculator.setOperation(new DivideOperation());
                break;
        }
        return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}