package C0511;

// 방법 1 : 클래스를 상속받아서 사용
public class TestThread {
    public static void main(String[] args) {
        TimerThread th = new TimerThread();
        th.start();
    }
}
class TimerThread extends Thread{
    int n = 0;

    @Override
    public void run() {
        while(true){
            System.out.println(n);
            n++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
    }
}