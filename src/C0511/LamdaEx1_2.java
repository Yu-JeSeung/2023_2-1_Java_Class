package C0511;
interface SumInterface{
    int plus(int x, int y); // publick abstract 자동으로 만들어짐.
}
interface CalcInterface{
    int calc(int x,int y);
}
public class LamdaEx1_2 {
    private static int add(int x, int y){
        return x+y;
    }
    private static int sub(int x,int y){
        return x-y;
    }
    private static int mul(int x, int y){
        return x*y;
    }


    public static void main(String[] args) {
        System.out.println("더하기 "+add(20,10));
        System.out.println("빼기 "+sub(20,10));
        System.out.println("곱허기 "+mul(20,10));

        // interface variable(변수) = 람다식(Lamda exp)
        SumInterface hap = (x, y) -> x*y;
        System.out.println("람다식 더하기 "+hap.plus(20,10));

        // 람다식 더하기, 빼기, 곱하기, 나누기, 나머지 값 구하는 람다식을 작성하고 출력
        // CalcInterface 를 활용
        CalcInterface plus = (x,y)->x+y;
        CalcInterface sub = (x,y)->x-y;
        CalcInterface mul = (x,y)->x*y;
        CalcInterface na = (x,y)->x/y;
        CalcInterface mod = (x,y)->x%y;

        System.out.println("람다식 더하기 "+plus.calc(20,10));
        System.out.println("람다식 빼기 "+sub.calc(20,10));
        System.out.println("람다식 곱하기 "+mul.calc(20,10));
        System.out.println("람다식 나누기 "+na.calc(20,10));
        System.out.println("람다식 나머지 "+mod.calc(20,10));
    }
}


