package C0309;
public class Car {
    // 필드
    String color;
    int speed = 0;
    // 공통 필드
    static int carCount = 0;
    final static int MAXSPEED = 200;
    final static int MINSPEED = 0;
    static int currentCarCount(){
        return carCount;
    }

    // 생성자
    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
        carCount++;
    }
    public Car(){
        carCount++;
    };

    // 메소드
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void upSpeed(int value){
        if(speed + value >=200)
            speed = 200;
        else
            speed = speed+value;
    }
    void downSpeed(int value){
        if(speed-value<=0){
            speed = 0;
        }
        else
            speed = speed - value;
    }
}
