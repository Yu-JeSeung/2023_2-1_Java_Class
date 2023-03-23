package C0323;

import java.io.*;
import java.nio.Buffer;

public class Ex8_2 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("/Users/jeseung/Documents/사진/뿌뿌3.png");

            // 버퍼 입력 방법 1
            BufferedInputStream bin = new BufferedInputStream(fin);
            // 방법 2
            // BufferedInputStream bin = new BufferedInputStream(new FileInputStream("/Users/jeseung/Documents/사진/뿌뿌3.png"));

            FileOutputStream fout = new FileOutputStream("/Users/jeseung/Documents/사진/뿌뿌123.png");
            // 버퍼 출력 방법 1
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            // 방법 2
            // BufferedOutputStream bin = new BufferedOutputStream(new FileOutputStream("/Users/jeseung/Documents/사진/뿌뿌3.png"));

//            int c;
//            while((c = fin.read())!=-1){ // 1 바이트씩 읽기 때문에 while문, 없으면 -1 주기 때문에
//                fout.write(c);
//            }
//            System.out.println("복사되었습니다.");
//            fin.close();
//            fout.close();

            // 버퍼로 출력
            int d;
            while((d = bin.read())!=-1){
                bout.write(d);
            }
            System.out.println("복사되었습니다.");
            bin.close();
            bout.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("에러 발생");
        }
    }
}
