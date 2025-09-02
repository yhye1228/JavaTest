class Car
{
    private String brand;
    private int speed;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나

// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main
{
    public static void main(String[] args)
    {
        Car myCar = new Car();
        myCar.setBrand("기아");
        myCar.setSpeed(280);
        myCar.setColor("검은색");

        System.out.println("브랜드 : " + myCar.getBrand());
        System.out.println("최고속도 : " + myCar.getSpeed());
        System.out.println("색상 : " + myCar.getColor());
    }
}
