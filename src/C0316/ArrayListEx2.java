package C0316;

import java.util.ArrayList;

public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(5);
        aList.add(4);
        aList.add(-1);

        aList.add(2,100); // 2번 인덱스에 100 추가
        System.out.println("List 내의 요수 객체 수 : "+aList.size());

        // for-each문
        for(Integer item: aList)
        {
            System.out.println(item);
        }

        // for문
        for(int i=0;i<aList.size();i++)
        {
            int n = aList.get(i);
            System.out.println(n);
        }

        int sum=0;
        for(int i=0;i<aList.size();i++)
        {
            int n=aList.get(i);
            sum+=n;
        }

        System.out.println("리스트에 있는 정수 합 : "+sum);
    }
}
