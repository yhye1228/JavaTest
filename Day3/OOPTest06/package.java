package kr.co.verthasys.project1;

import com.google.Util;//path
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main//파일명과 같은 함수만 퍼블릭이 될 수 있다
{
    public static void main(String[] args)
    {
        Car car = new Car();

        System.out.println(car.speed);
    }
}
