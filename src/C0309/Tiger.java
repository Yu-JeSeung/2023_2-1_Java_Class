package C0309;

public class Tiger extends Animal implements inAnimal{
    int age;

    @Override
    void move() {
        System.out.println("네발로 이동한다.");
    }

    @Override
    public void eat() {
        System.out.println("멧돼지를 잡아먹는다.");
    }
}
