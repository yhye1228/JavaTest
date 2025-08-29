

import org.w3c.dom.ls.LSOutput;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main
{
    public static void main(String[] args)
    {
        Flower rose = new Flower();
        rose.season = "여름";
        System.out.println("꽃 이름 : " + rose.name);
        System.out.println("꽃이피는 계절 : " + rose.season);

        Flower Tulip = new Flower("튤립");
        System.out.println("꽃 이름 : " + Tulip.name);
        //System.out.println("꽃 색깔 : " + violet.color);

        Flower lily = new Flower("백합", "흰색");
        System.out.println("꽃 이름 : " + lily.name);
        System.out.println("꽃 색깔 : " + lily.color);

        Flower violet = new Flower("제비꽃", "보라색", "봄");
        System.out.println("꽃 이름 : " + violet.name);
        System.out.println("꽃 색깔 : " + violet.color);
        System.out.println("꽃이 피는 계절 : " + violet.season);

        System.out.println(lily.Bloom());
        System.out.println(lily.decline());
    }

}
