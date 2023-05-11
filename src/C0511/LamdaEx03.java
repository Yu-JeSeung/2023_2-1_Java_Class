package C0511;
interface MyFunction{ // 함수형 인터페이스
    void print(); // 람다식으로 구현할 추상 메소드
}
public class LamdaEx03 {
    public static void main(String[] args) {
        MyFunction f = () -> { // 람다식 작성
            System.out.println("Hello");
        };

        f.print(); // 람다식 호출

        f = () -> System.out.println("안녕");

        f.print(); // 람다식 호출
    }
}
