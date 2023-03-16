package C0316;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx_7_3 {
    public static void main(String[] args) {
        // 문자열만 삽입 가능한 ArrayList 컬렉션 생성
        ArrayList<String> a = new ArrayList<String>();
        // ArrayList<String> a = new ArrayList<>(); 이나
        // var a = new ArrayList<String>(); 둘다 가능

        // 키보드로부터 4개의 이름 입력 받아 ArrayList에 삽입
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            System.out.print("이름을 입력하세요 >> ");
            String s = scanner.next();
            a.add(s);   // ArrayList 컬렉션 삽입
        }

        // ArrayList에 들어 있는 모든 이름 출력
        for(int i=0;i<a.size();i++)
        {
            // ArrayList의 i번째 문자열 얻어오기
            String name = a.get(i);
            System.out.print(name+" ");
        }

        // 가장 긴 이름 출력
        int longesIndex = 0;
        for(int i=0;i<a.size();i++)
        {
            if(a.get(longesIndex).length()<a.get(i).length()) {
                longesIndex = i;
            }
        }
        System.out.println("\n가장 긴 이름은 : "+a.get(longesIndex));
        scanner.close();
    }
}