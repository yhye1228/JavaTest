public class Calculator {
    // 덧셈, 뺄셈, 곱셈, 나눗셈
    //1. 멤버변수(필드) = (X)
    //2. 생성자(디폴트 생성자만)
    //3. 멤머 메소드
    public int plus(int a, int b)
    {
        return a + b;
    }
    public int minus(int a, int b)
    {
        return a - b;
    }
    public int multiple(int a, int b)
    {
        return a * b;
    }
    public double divide(int a, int b)
    {
        return (double)a / b;
    }
}
