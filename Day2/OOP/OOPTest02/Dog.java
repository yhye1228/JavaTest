public class Dog
{
    //1. 멤버변수
    String name;
    int age;
    String color;
    //2. 생성자 - 객체 초기화
    //생성자를 두 개 이상 구현=> 생성자 오버로딩
    Dog()
    {
        this.name = "댕댕이";
        this.age = 3;
        this.color = "누런색";
    }
    Dog(String name){
        this.name = name;
        //his.color = "누런색";
    }
    Dog(int age, String name, String color){
        this.age = age;
        this.name = name;
        this.color = color;
    }
    //3. 멤버 메소드
    String Run()
    {
        //System.out.println("달리다~~");
        return "달리다~~";
    }
    String Eat()
    {
        //System.out.println("먹다.");
        return "먹다. ";
    }
    String Bark()
    {
        //System.out.println("멍!멍!");
        return "멍!멍!";
    }
}
