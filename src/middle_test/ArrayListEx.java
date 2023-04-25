package middle_test;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String>a = new ArrayList<String>();
        a.add("Java");
        a.add(0,"C++");
        a.remove(a.size()-1);

        for(int x=0;x<a.size();x++)
        {
            System.out.println(a.get(x));
        }
    }
}
