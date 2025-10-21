public class AdvancedCalculator extends Calculator {
    // 계산기 v2.0 개발
    // 이슈 : https://github.com/sumannam/Java-Calculator/issues/5

    // 곱셈 연산자로 두 수 곱하기 완료
    // https://github.com/sumannam/Java-Calculator/issues/6
    @Override
    public int multiply()
    {
        result = num1 * num2;
        return result;
    }

    // 나누셈 연산자로 두 수 나누기 완료
    // https://github.com/sumannam/Java-Calculator/issues/7
    @Override
    public int divide()
    {
        result = num1 / num2;
        return result;
    }
}