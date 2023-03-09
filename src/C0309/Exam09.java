package C0309;

public class Exam09 {
    public static void main(String[] args) {
        Automobile 내승용차 = new Automobile();
        내승용차.upSpeed(250);
        내승용차.setColor("오렌지");
        System.out.println("내 승용차의 색상은 "+내승용차.getColor());
    }
}
