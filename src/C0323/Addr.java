package C0323;

import java.time.LocalDateTime;

// 설계도
public class Addr {
    // 필드
    private String name;
    private String phone;
    private String company;

    private LocalDateTime date;

    // 생성자
    public Addr(String name, String phone, String company, LocalDateTime date) {
        this.name = name;
        this.phone = phone;
        this.company = company;
        this.date = date;
    }

    // 메소드 getter setter toString()
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "[주소 : 이름 = " + name + ", 전화번호 = " + phone + ", 회사 = " + company + ", 입력날짜 = " + date +
                ']';
    }
}
