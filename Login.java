import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
	public Login() {
		Scanner s = new Scanner(System.in);
		Connection conn; 
		Statement stmt = null;
		while(StaticV.user == null) {
			System.out.println("ID와 PASSWORD를 입력하세요.");
			String lii = s.next();
			String lpa = s.next();	
			System.out.println("===============================================================================================================");
			System.out.println("						The L♡ver");
			System.out.println("===============================================================================================================");
			
			try {
				Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");		
				conn = DriverManager.getConnection("jdbc:ucanaccess://d:/Team13/Database.accdb");
				stmt = conn.createStatement();
				ResultSet rs1 = stmt.executeQuery("select ID from 회원  where 회원.ID = '" + lii + "';");
				ResultSet rs2 = stmt.executeQuery("select PASS from 회원  where 회원.ID = '" + lii + "' and 회원.PASS = '" + lpa + "';");
				ResultSet rs3 = stmt.executeQuery("select 회원.성별 from 회원 where 회원.ID = '" + lii + "';");
				
				if(rs1.next()) {
					String vid = rs1.getString("ID");
					if(rs2.next()) {
						if(rs3.next()) {
							String vse = rs3.getString("성별");
							StaticV.users = vse;
						}
						String vpa = rs2.getString("PASS");
						System.out.println("로그인 성공!");
						StaticV.user = vid;
						
						System.out.println(StaticV.user + "님 방문을 환영합니다!");
						conn.close();
					}
					else {
						System.out.println("PASSWORD를 잘못 입력하셨습니다.");
					}
					conn.close();
				}
				else {
					System.out.println("회원가입정보가 없습니다!");
				}
			}
		
			catch (ClassNotFoundException e) {
				System.out.println("JDBC 드라이버 로드 에러");
			}
			catch (SQLException e) {
				System.out.println("DB 연결 오류");
			}
		}
	}
}
