package C0309;

public class Exam06 {
    public static void main(String[] args) {
        int num1=100, num2 = 0;
        try {
            System.out.println(num1/num2);
        }
        catch(java.lang.ArithmeticException e){
            System.out.println("계산에 문제가 있습니다.");
                e.printStackTrace(); // 반대로 돌아가면서 잘못된 부분 출력
        }
    }
}
