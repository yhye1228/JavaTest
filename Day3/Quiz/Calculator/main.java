import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main
{
    public static void main(String[] args)
    {
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("1번 정수를 입력하세요 : ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("2번 정수를 입력하세요 : ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println();

        System.out.println("+ 결과 출력 : " + cal.plus(a, b));
        System.out.println("- 결과 출력 : " + cal.minus(a, b));
        System.out.println("* 결과 출력 : " + cal.multiple(a, b));
        System.out.println("/ 결과 출력 : " + cal.divide(a, b));
    }
}
