import java.time.chrono.IsoEra;

public class Flower
{
    //1. 멤버변수
    String name;    // 이름
    String season;        // 개화시기
    String color;   // 색상
    //2.
    Flower()//디폴트 생성자
    {
        this.name = "장미";
        this.season = "여름";
        this.color = "빨강";
    }
    Flower(String name)
    {
        this.name = name;
    }
    Flower(String name, String color)
    {
        this.name = name;
        this.color = color;
    }
    Flower(String name, String season, String color)
    {
        this.name = name;
        this.season = season;
        this.color = color;
    }
    //3. 메소드(동사)
    String Bloom()
    {
        return "개화하다";
    }
    String decline()
    {
        return "시들다.";
    }



}
