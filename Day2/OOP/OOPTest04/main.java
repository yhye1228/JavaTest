//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main
{
    public static void main(String[] args)
    {
        Cat myCat = new Cat();
        //myCat.name = "메리";    //직접접근(x)
        Cat newCat = new Cat("나비", 3, "Yellow");
        System.out.println("고양이 이름 : " + newCat.getName()); // 간접접근
        System.out.println("고양이 나이 : " + newCat.getAge());
        System.out.println("고양이 색깔 : " + newCat.getColor());

        myCat.Meow();
        myCat.Eat();
    }
}
