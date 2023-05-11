package C0511;

public class SynchronizedEx {
    public static void main(String[] args) {
        SharedBoard board  = new SharedBoard();
        Thread th1 = new StudentThread("철수",board);
        Thread th2 = new StudentThread("둘리",board);
        Thread th3 = new StudentThread("영희",board);
        th1.start();
        th2.start();
        th3.start();
    }
}
class SharedBoard{
    private int sum=0;
    synchronized public void add(){
        int n=sum;
        Thread.yield(); // 현재 실행중인 스레드 양보
        n+=10;
        sum=n; // 증가값 집계합에 기록
        System.out.println(Thread.currentThread().getName()+": "+sum);
    }
    public int getSum(){return sum;}
}

class StudentThread extends Thread{
    private SharedBoard board; // 집계판 주소
    public StudentThread(String name, SharedBoard board){
        super(name);
        this.board=board;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            board.add();
        }
    }
}