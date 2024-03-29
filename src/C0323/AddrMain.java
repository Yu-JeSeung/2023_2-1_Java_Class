package C0323;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class AddrMain {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Addr> addList = new ArrayList<Addr>();

    public static void main(String[] args) {
        int menu,flag=1;
        while(true){
            System.out.println("-------------------------- \n" +
                    "1. 주소록 입력\n" +
                    "2. 주소록 검색\n" +
                    "3. 주소록 조회\n" +
                    "4. 주소록 수정\n" +
                    "5. 주소록 삭제\n" +
                    "0. 종료 \n----------------------------");
            System.out.print("메뉴를 입력하세요 : ");
            menu = scanner.nextInt();
            if(menu==0){
                System.out.println("종료합니다.");
                break;
            }
            switch (menu)
            {
                case 1:
                    addrInput();
                    break;
                case 2:
                    System.out.println("주소록을 검색합니다.");
                    addrSearch();
                    break;
                case 3:
                    System.out.println("주소록 전체 명단을 조회합니다.");
                    addrAll();
                    break;
                case 4:
                    System.out.println("주소록을 수정합니다.");
                    addrUpdate();
                    break;
                case 5:
                    System.out.println("주소록을 삭제합니다.");
                    addrDelete();
                    break;
                case 0:
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                    flag=0;
            }
        }
    }
    public static void addrInput(){
        System.out.println("주소록을 입력합니다.");
        System.out.print("이름을 입력하세요 : ");
        String name = scanner.next();
        System.out.print("전화번호를 입력하세요 : ");
        String phone = scanner.next();
        System.out.print("회사를 입력하세요 : ");
        String company = scanner.next();
        LocalDateTime date = LocalDateTime.now();
        Addr ad1 = new Addr(name,phone,company,date);
        addList.add(ad1);
        System.out.println(name+" 입력되었습니다.");
    }
    public static void addrAll() {
        for (Addr addr : addList) {
            System.out.println(addr);
        }
    }

    public static void addrSearch(){
        System.out.print("검색할 회원의 이름을 입력하세요 : ");
        String find_name = scanner.next();
        for( Addr addr : addList){
            if(addr.getName().equals(find_name)){
                System.out.println(addr);
            }
        }
    }

    public static void addrUpdate(){
        System.out.print("수정할 회원의 이름을 입력하세요 : ");
        String update_name = scanner.next();
        System.out.print("수정할 회원의 전화번호를 입력하세요 : ");
        String update_phone = scanner.next();
        System.out.print("수정할 회원의 회사를 입력하세요 : ");
        String update_company = scanner.next();
        for( Addr addr : addList){
            if(addr.getName().equals(update_name)){
                addr.setPhone(update_phone);
                addr.setCompany(update_company);
                System.out.println(addr+" 수정되었습니다. ");
            }
        }
    }

    public static void addrDelete(){
        System.out.print("삭제할 이름을 입력하세요 : ");
        String delete_name = scanner.next();
        for(int i=0;i<addList.size();i++){
            if(addList.get(i).getName().equals(delete_name)){
                addList.remove(i);
            }
        }
    }
}
