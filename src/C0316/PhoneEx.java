package C0316;

import java.util.ArrayList;

public class PhoneEx {
    public static void main(String[] args) {
        ArrayList<Phone> myphone = new ArrayList<>();

        Phone phList1 = new Phone("갤럭시S23","삼성전자",1000000);
        Phone phList2 = new Phone("갤럭시S20","삼성전자",200000);
        Phone phList3 = new Phone("아이폰14","애플",1500000);
        Phone phList4 = new Phone("갤럭시A33","삼성전자",300000);
        Phone phList5 = new Phone("아이폰13","애플",900000);

        myphone.add(phList1);
        myphone.add(phList2);
        myphone.add(phList3);
        myphone.add(phList4);
        myphone.add(phList5);

        System.out.println("====== 제조사별 출력 ======\n");
        System.out.println("====== 삼성폰 ======");
        for(Phone mm : myphone)
        {
            if(mm.getCompany().equals("삼성전자"))
            {
                System.out.println(mm.getpName() +" "+ mm.getCompany() +" "+ mm.getPrice());
            }
        }

        System.out.println("====== 애플폰 ======");
        for(Phone mm : myphone)
        {
            if(mm.getCompany().equals("애플"))
            {
                System.out.println(mm.getpName() +" "+ mm.getCompany() +" "+ mm.getPrice());
            }
        }
        System.out.println(" ");
        System.out.println("====== 100원미만 핸드폰 ======");
        for(Phone mm : myphone)
        {
            if(mm.getPrice()<1000000){
                System.out.println(mm.getpName() +" "+ mm.getCompany() +" "+ mm.getPrice());
            }
        }
    }
}
