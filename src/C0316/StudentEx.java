package C0316;

import java.util.ArrayList;

public class StudentEx {
    public static void main(String[] args) {
        ArrayList<Student> sList = new ArrayList<Student>();

        Student std1 = new Student("유제승",20221020,"컴퓨터소프트웨어공학과","010-9014-4310");
        Student std2 = new Student("김수한무",20220001,"컴퓨터정보공학과","010-1111-1111");
        Student std3 = new Student("거북이",20220002,"컴퓨터정보공학과","010-2222-2222");
        Student std4 = new Student("두루미",20220003,"인공지능소프트웨어공학과","010-3333-3333");

        sList.add(std1);
        sList.add(std2);
        sList.add(std3);
        sList.add(std4);

        // 응용프로그램 작성

        // 전체 명단
        System.out.println("====================== 전체 명단 ====================");
        for(Student eachone : sList)
        {
            System.out.println(eachone.getName() + eachone.getStuId() + eachone.getDept() + eachone.getTel());
        }
        System.out.println("====================== 컴소과 명단 ====================");
        // 컴소과 명단
        for(Student eachone : sList)
        {
            if(eachone.getDept().equals("컴퓨터소프트웨어공학과"))
                System.out.println(eachone.getName() + eachone.getStuId() + eachone.getDept() + eachone.getTel());
        }
        System.out.println("======================= 인소과 명단 ====================");
        // 인소과 명단
        for(Student eachone : sList)
        {
            if(eachone.getDept().equals("인공지능소프트웨어공학과"))
                System.out.println(eachone.getName() + eachone.getStuId() + eachone.getDept() + eachone.getTel());
        }
    }
}
