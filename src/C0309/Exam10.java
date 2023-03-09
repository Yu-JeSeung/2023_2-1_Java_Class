package C0309;

public class Exam10 {
    public static void main(String[] args) {
        Tiger tiger1 = new Tiger();
        tiger1.name="시베리아호랑이";
        System.out.print(tiger1.name+" ");
        tiger1.move();
        tiger1.eat();
        Eagle eagle1 = new Eagle();
        eagle1.name="백두산독수리";
        System.out.print(eagle1.name+" ");
        eagle1.move();
        eagle1.eat();
    }
}
