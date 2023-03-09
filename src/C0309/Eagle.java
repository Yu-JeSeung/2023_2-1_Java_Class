package C0309;

public class Eagle extends Animal implements inAnimal{
    String home;
    @Override
    void move() {
        System.out.println("날개로 이동한다.");
    }

    @Override
    public void eat() {
        System.out.println("생선을 좋아한다.");
    }
}
