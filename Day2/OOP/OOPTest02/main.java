//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main
{
    public static void main(String[] args)
    {
        Dog mary = new Dog();//객체 생성

        mary.name = "메리";// 생성 후 초기화
        //생성자를 두 개 이상 구현=> 생성자 오버로딩
        System.out.println("메리의 이름 : " + mary.name);
        System.out.println("메리의 나이 : " + mary.age);
//        String name = mary.name;
//        System.out.println("이름 : " + name);
        Dog ppoppi = new Dog("뽀삐");
        System.out.println("뽀삐의 이름 : " + ppoppi.name);
        System.out.println("뽀삐의 색깔 : " + ppoppi.color);

        Dog bob = new Dog(5, "bob", "검은색");
        System.out.println("밥의 이름 : " + bob.name);
        System.out.println("밥의 색깔 : " + bob.color);
        System.out.println("밥의 나이 : " + bob.age);
        System.out.println(bob.Run());
        System.out.println(bob.Eat());
        System.out.println(bob.Bark());
    }
}
