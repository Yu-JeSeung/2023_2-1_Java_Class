package C0316;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsEx {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("스타워즈");
        myList.add("매트릭스");
        myList.add("아바타");
        myList.add(2,"터미네이터");
        myList.add(0,"트랜스포머");

        System.out.println("\n===== 정렬 전 =====");
        for(String movie : myList)
        {
            System.out.println(movie);
        }

        Collections.sort(myList);
        System.out.println("\n===== 정렬 후 =====");
        for(String movie : myList)
        {
            System.out.println(movie);
        }

        System.out.println("\n===== 정렬 후 반대로 출력 =====");
        Collections.reverse(myList);
        for(String movie : myList)
        {
            System.out.println(movie);
        }

        System.out.println("\n===== 특정 이름 위치 출력 =====");
        int index = Collections.binarySearch(myList,"아바타")+1;
        System.out.println("아바타는 " + index + " 번째 요소입니다.");
    }
}
