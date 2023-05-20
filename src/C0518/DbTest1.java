package C0518;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

public class DbTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		// 디비 정보 불러오기
		Connection conn = null;
		Statement stmt = null;
		
		// 디비랑 연동하기
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "dongyang");
			System.out.println("sampledb에 연결 완료~~");
			
			// 연동 된 디비 내용 출력하기
			stmt = conn.createStatement();
			// 디비 내용 변경
			stmt = executeUpdate("insert into studenttb1 values('21007','이무개','경영학과');");
			stmt = executeUpdate("insert into studenttb1 values('21008','리사','스포츠학과');");
			stmt = executeUpdate("update studenttb1 set id='21012' where sname='리사'");
			stmt = executeUpdate("delete from student where name='제임스본드");
			ResultSet results = stmt.executeQuery("select * from studenttb1");
			while(results.next()) {
				System.out.println(results.getString("id")+results.getString(2)+results.getString(3));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("db driver 에러 또는 연결 에러");
			e.printStackTrace();
		}
		
	}

	private static Statement executeUpdate(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
