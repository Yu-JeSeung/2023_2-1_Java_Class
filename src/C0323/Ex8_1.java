package C0323;

import java.io.*;

public class Ex8_1 {
    public static void main(String[] args) {
        try {
            FileReader fin = new FileReader("/Users/jeseung/Documents/학교/2학년 1학기/객체지향 프로그래밍응용/수업/test.txt");
            FileWriter fout = new FileWriter("/Users/jeseung/Documents/학교/2학년 1학기/객체지향 프로그래밍응용/수업/write.txt");

            // 버퍼로 수정
            BufferedReader bin = new BufferedReader(fin);
            BufferedWriter bout = new BufferedWriter(fout);

            // 버퍼로 출력
            int q;
            while((q = bin.read())!=-1){ // 1단어씩 읽기 때문에 while문, 없으면 -1 주기 때문에
                System.out.print((char)q);
                bout.write(q);
            }

            // 읽어오기
            int w;
            while((w = bin.read())!=-1){
                System.out.print((char)w);
            }
            bin.close();
            bout.close();

//            // 쓰기
//            int d;
//            while((d = fin.read())!=-1){ // 1단어씩 읽기 때문에 while문, 없으면 -1 주기 때문에
//                System.out.print((char)d);
//                fout.write(d);
//            }
//
//            // 읽어오기
//            int c;
//            while((c = fin.read())!=-1){
//                System.out.print((char)c);
//            }
//            fin.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일없음 에러~");
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("파일 read 에러~");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("에러났어요...");
        }
    }
}
