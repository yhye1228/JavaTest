//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
class Calculator
{
    //디폴트(기본) 생성자
    Calculator()
    {
        
    }
    //멤버 메소드(함수)
    public int Plus(int a, int b)
    {
        return a + b;
    }
    public int Minus(int a, int b)
    {
        return a - b;
    }
    public int Mulitiple(int a, int b)
    {
        return a * b;
    }
    public double Divide(int a, int b)
    {
        if(b != 0){
            return (double)a / b;   // 실수/정수 --> 실수
        }else{
            return 0;
        }

    }
}
public class Main
{
    // +, -, *, /
    //static : 실행과 동시에 호출
    public static void main(String[] args)
    {
        Calculator myCal = new Calculator();
        int a = 5, b = 7;
        System.out.println(myCal.Plus(a, b));
        System.out.println(myCal.Minus(a, b));
        System.out.println(myCal.Mulitiple(a, b));
        System.out.println(myCal.Divide(a, b));
//        System.out.println(Main.Plus(a, b));
//        System.out.println(Main.Minus(a, b));
    }
}
