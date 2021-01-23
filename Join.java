import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Join {
	public Join() {
		Scanner s = new Scanner(System.in);
		Connection conn; 
		Statement stmt = null;
		System.out.println("회원가입정보(ID, PASSWORD, 이름, 이메일, 휴대폰번호, 성별, 생년월일)를 입력하세요.");
		String jii = s.next();
		String jpa = s.next();
		String nn = s.next();
		String em = s.next();
		String mp = s.next();
		String se = s.next();
		String bi = s.next();
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");		
			conn = DriverManager.getConnection("jdbc:ucanaccess://d:/Team13/Database.accdb");
			stmt = conn.createStatement();
			
			stmt.executeUpdate("insert into 회원(ID, PASS, 이름, 이메일, 휴대폰번호, 성별, 생년월일) values('" + jii + "', '"+ jpa + "', '"+ nn +"', '"+ em + "', '" + mp + "', '"+ se+ "', '"+bi +"');");
			StaticV.user = jii;
			StaticV.users = se;
			System.out.println("===============================================================================================================");
			System.out.println("						The L♡ver");
			System.out.println("===============================================================================================================");
			System.out.println(nn + "님 회원가입을 축하드립니다!");
			conn.close();
		} 
		catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
		} 
		catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	
	}
}
