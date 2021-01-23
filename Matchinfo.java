import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Matchinfo {
	Scanner s = new Scanner(System.in);
	Matchinfo(){
	    Connection conn; 
	    Statement stmt = null;
	   
	    
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");		
			conn = DriverManager.getConnection("jdbc:ucanaccess://d:/Team13/Database.accdb");
			stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("select ID from 회원매치정보 where ID = '" + StaticV.user + "';");
			//추가정보 입력했는지 확인
			int rowcount = 0;
			while (rs.next()) {
				rowcount = rowcount + 1;
			}
			if(rowcount == 0) {
				System.out.println("추가회원정보 미입력 회원입니다.");
				System.out.println(">>>>추가회원정보 입력>>>>");
				System.out.println("키(150이하 / 150~160 / 160~170 / 170~180 / 180~190 / 190이상)");
				String hei = s.next();
				System.out.println("직업(무직, 학생, 사무직, 전문직, 의료직, 공무원, 금융직, 사업가, 교육직)");	
				String job = s.next();
				System.out.println("성격(차분한 / 유머있는 / 낙천적인 / 활발한 / 꼼꼼한 / 정직한 / 감성적인 / 친절한 / 털털한 / 도도한 / 애교있는 / 단순한 / 엉뚱한 / 덜렁대는 / 츤데레)");	
				String cha = s.next();
				System.out.println("음주여부(네 / 아니오)");
				String sul = s.next();
				System.out.println("흡연여부(네 / 아니오)");
				String smok = s.next();
				System.out.println("종교(무교 / 불교 / 기독교 / 천주교 / 힌두교 / 이슬람교 / 원불교)");	
				String reli = s.next();
				System.out.println("지역(서울특별시 / 경기도 / 강원도 / 충정남도 / 충청북도 / 전라남도 / 전라북도 / 경상남도 / 경상북도 / 제주도 / 부산광역시 / 대전광역시 / 대구광역시 / 울산광역시 / 광주광역시 / 인천광역시)");	
				String reg = s.next();
				System.out.println("데이트스타일(스포츠관람 / 맛집투어 / 여행 / 영화관람 / 콘서트관람 / 집데이트 / 바깥데이트)");
				String ds = s.next();
							
			    stmt.executeUpdate("insert into 회원매치정보(ID, 성별, 키, 직업, 성격, 음주여부, 흡연여부, 종교, 지역, 데이트스타일, 횟수) values ('" + StaticV.user + "', '"+ StaticV.users +"', '" +hei + "', '"+ job +"', '"+ cha + "', '" + sul+ "', '"+ smok+ "', '"+reli +"', '"+ reg + "','" + ds + "'," + 0 + ");");
			    
			    System.out.println("입력완료!");
			    System.out.println("---------------------------------------------------------------------------------------------------------------");
			}
			else {
				System.out.println("매치정보 입력확인!");
			}
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