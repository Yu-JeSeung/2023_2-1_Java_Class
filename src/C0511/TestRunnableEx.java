package C0511;

public class TestRunnableEx implements Runnable{
    int n =0;
    @Override
    public void run() {
        while(true){
            System.out.println(n);
            n++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
class TestRunnable{
    public static void main(String[] args) {
        Thread th = new Thread(new TestRunnableEx());
        th.start();
    }
}
