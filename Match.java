import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.Random;

public class Match {
	public Match() {
		Random r = new Random();
		Scanner aa = new Scanner(System.in);
		String styleH, styleJ, styleC, styleS, styleSm, styleR, styleRg, styleD;
		System.out.println(StaticV.user +"님의 이상형 매치를 시작하겠습니다.");
		System.out.println("이상형을 입력하세요");
		System.out.println("키(150이하 / 150~160 / 160~170 / 170~180 / 180~190 / 190이상)");
		styleH = aa.next();
		System.out.println("직업(무직, 학생, 사무직, 전문직, 의료직, 공무원, 금융직, 사업가, 교육직)");	
		styleJ = aa.next();
		System.out.println("성격(차분한 / 유머있는 / 낙천적인 / 활발한 / 꼼꼼한 / 정직한 / 감성적인 / 친절한 / 털털한 / 도도한 / 애교있는 / 단순한 / 엉뚱한 / 덜렁대는 / 츤데레)");	
		styleC = aa.next();
		System.out.println("음주여부(네 / 아니오)");
		styleS = aa.next();
		System.out.println("흡연여부(네 / 아니오)");
		styleSm = aa.next();
		System.out.println("종교(무교 / 불교 / 기독교 / 천주교 / 힌두교 / 이슬람교 / 원불교)");	
		styleR = aa.next();
		System.out.println("지역(서울특별시 / 경기도 / 강원도 / 충정남도 / 충청북도 / 전라남도 / 전라북도 / 경상남도 / 경상북도 / 제주도 / 부산광역시 / 대전광역시 / 대구광역시 / 울산광역시 / 광주광역시 / 인천광역시)");	
		styleRg = aa.next();
		System.out.println("데이트스타일(스포츠관람 / 맛집투어 / 여행 / 영화관람 / 콘서트관람 / 집데이트 / 바깥데이트 / 주말데이트)");
		styleD = aa.next();
				// 여자일때 남자 검색
			if (StaticV.users.equals("여")) {
					
				Connection conn; 
				Statement stmt = null;
							//키
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");		
					conn = DriverManager.getConnection("jdbc:ucanaccess://d:/Team13/Database.accdb");
					stmt = conn.createStatement();
					ResultSet C = stmt.executeQuery("select * from 회원매치정보 where 성별='남' and 지역='" + styleRg + "' and 키='" + styleH + "';");
								
					while (C.next()) {
						String iiid = C.getString("ID");
						int cnt = C.getInt("횟수");
						cnt = cnt + 1;
						stmt.executeUpdate("update 회원매치정보 set 횟수 =" + cnt + " where ID='" + iiid + "';");
					}
		
				}
				catch (ClassNotFoundException e) {
					System.out.println("JDBC 드라이버 로드 에러");
				} 
				catch (SQLException e) {
					System.out.println("DB 연결 오류1");
				}
							//직업
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");		
					conn = DriverManager.getConnection("jdbc:ucanaccess://d:/Team13/Database.accdb");
					stmt = conn.createStatement();
					ResultSet C = stmt.executeQuery("select * from 회원매치정보 where 성별='남' and 지역='" + styleRg + "' and 직업='" + styleJ + "';");
					while (C.next()) {
						String iiid = C.getString("ID");
						int cnt = C.getInt("횟수");
						cnt = cnt + 1;
						stmt.executeUpdate("update 회원매치정보 set 횟수 =" + cnt + " where ID='" + iiid + "';");
					}
				}
				catch (ClassNotFoundException e) {
					System.out.println("JDBC 드라이버 로드 에러");
				} 
				catch (SQLException e) {
					System.out.println("DB 연결 오류2");
				}	
							//성격
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");		
					conn = DriverManager.getConnection("jdbc:ucanaccess://d:/Team13/Database.accdb");
					stmt = conn.createStatement();
					ResultSet C = stmt.executeQuery("select * from 회원매치정보 where 성별='남' and 지역='" + styleRg + "' and 성격='" + styleC + "';");
					while (C.next()) {
						String iiid = C.getString("ID");
						int cnt = C.getInt("횟수");
						cnt = cnt + 1;
						stmt.executeUpdate("update 회원매치정보 set 횟수 =" + cnt + " where ID='" + iiid + "';");
					}
				}
				catch (ClassNotFoundException e) {
					System.out.println("JDBC 드라이버 로드 에러");
				} 
				catch (SQLException e) {
					System.out.println("DB 연결 오류3");
				}	
							//음주여부
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");		
					conn = DriverManager.getConnection("jdbc:ucanaccess://d:/Team13/Database.accdb");
					stmt = conn.createStatement();
					ResultSet C = stmt.executeQuery("select * from 회원매치정보 where 성별='남' and 지역='" + styleRg + "' and 음주여부='" + styleS + "';");
					while (C.next()) {
						String iiid = C.getString("ID");
						int cnt = C.getInt("횟수");
						cnt = cnt + 1;
						stmt.executeUpdate("update 회원매치정보 set 횟수 =" + cnt + " where ID='" + iiid + "';");
					}
				}
				catch (ClassNotFoundException e) {
					System.out.println("JDBC 드라이버 로드 에러");
				} 
				catch (SQLException e) {
					System.out.println("DB 연결 오류4");
				}
							//흡연여부
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");		
					conn = DriverManager.getConnection("jdbc:ucanaccess://d:/Team13/Database.accdb");
					stmt = conn.createStatement();
					ResultSet C = stmt.executeQuery("select * from 회원매치정보 where 성별='남' and 지역='" + styleRg + "' and 흡연여부='" + styleSm + "';");
					while (C.next()) {
						String iiid = C.getString("ID");
						int cnt = C.getInt("횟수");
						cnt = cnt + 1;
						stmt.executeUpdate("update 회원매치정보 set 횟수 =" + cnt + " where ID='" + iiid + "';");
					}
				}
				catch (ClassNotFoundException e) {
					System.out.println("JDBC 드라이버 로드 에러");
				} 
				catch (SQLException e) {
					System.out.println("DB 연결 오류5");
				}
							//종교
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");		
					conn = DriverManager.getConnection("jdbc:ucanaccess://d:/Team13/Database.accdb");
					stmt = conn.createStatement();
					ResultSet C = stmt.executeQuery("select * from 회원매치정보 where 성별='남' and 지역='" + styleRg + "' and 종교='" + styleR + "';");
					while (C.next()) {
						String iiid = C.getString("ID");
						int cnt = C.getInt("횟수");
						cnt = cnt + 1;
						stmt.executeUpdate("update 회원매치정보 set 횟수 =" + cnt + " where ID='" + iiid + "';");
					}
				}
				catch (ClassNotFoundException e) {
					System.out.println("JDBC 드라이버 로드 에러");
				} 
				catch (SQLException e) {
					System.out.println("DB 연결 오류6");
				}
							//데이트스타일
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");		
					conn = DriverManager.getConnection("jdbc:ucanaccess://d:/Team13/Database.accdb");
					stmt = conn.createStatement();
					ResultSet C = stmt.executeQuery("select * from 회원매치정보 where 성별='남' and 지역='" + styleRg + "' and 데이트스타일='" + styleD  + "';");
					while (C.next()) {
						String iiid = C.getString("ID");
						int cnt = C.getInt("횟수");
						cnt = cnt + 1;
						stmt.executeUpdate("update 회원매치정보 set 횟수 =" + cnt + " where ID='" + iiid + "';");
					}
				}
				catch (ClassNotFoundException e) {
					System.out.println("JDBC 드라이버 로드 에러");
				} 
				catch (SQLException e) {
					System.out.println("DB 연결 오류7");
				}
		
							// 진짜 매치할 사람 찾아주기 (count가 최대인 count 최대값 검색)
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");		
					conn = DriverManager.getConnection("jdbc:ucanaccess://d:/Team13/Database.accdb");
					stmt = conn.createStatement();
					ResultSet rs2 = stmt.executeQuery("select * from 회원매치정보;");
					int rowcount = 0;
					//전체 회원수(배열크기)
					while (rs2.next()) {
						rowcount = rowcount + 1;
					}	
					//전체 회원수 크기의 배열
					int Array[] = new int [rowcount];
					//다뽑아
					ResultSet rs3 = stmt.executeQuery("select * from 회원매치정보;");
					
					//전체 회원테이블의 횟수열만 배열에 저장
					int i = 0;
					while (rs3.next()) {
						Array[i] = rs3.getInt("횟수");
						i++;
					}
					
					int mCount = Array[0];
					
					//횟수 배열의 최댓값을 mCount에 저장
					for(int j = 1; j<Array.length; j++) {
						if(Array[j]>= mCount) {
							mCount = Array[j];
						}
					}
					
					try {
						Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");		
						conn = DriverManager.getConnection("jdbc:ucanaccess://d:/Team13/Database.accdb");
						stmt = conn.createStatement();
						String coup1 = "";
						ResultSet rs = stmt.executeQuery("select * from 회원매치정보 where 횟수=" + mCount + ";");
						//조건에 맞는 레코드의 수를 c에 저장
						int c = 0;
						while (rs.next()) {
							c++;
							coup1 = rs.getString("ID");
						}
						//최댓값이 0 즉, 조건에 맞는 사람이 아무도 없을때
						if(mCount == 0) {
							System.out.println("찾으시는 L♡ver가 존재하지 않습니다.");
						}
						//조건에 맞는 사람이 1명일때
						else if(c == 1) {
							stmt.executeUpdate("insert into 매치(여자, 남자) values('" + StaticV.user + "', '" + coup1 + "');");
							System.out.println("===============================================================================================================");
							System.out.println("					    The L♡ver");
							System.out.println("===============================================================================================================");
							System.out.println("매치진행중>>>");
							System.out.println("매치진행중>>>");
							System.out.println("매치진행중>>>");
							System.out.println(coup1 + "님과 매치되었습니다♥");
							stmt.executeUpdate("update 회원매치정보 set 횟수 = 0;");
						}
						//조건에 맞는 사람이 다수일때
						//사람수 크기의 배열을 만들어서 그중 랜덤으로 매치
						else if(c > 1) {
							String Array2[] = new String [c];
							ResultSet rs4 = stmt.executeQuery("select * from 회원매치정보 where 횟수=" + mCount + ";");
							int i2 = 0;
							while (rs4.next()) {
								Array2[i2] = rs4.getString("ID");
								i2++;
							}
							int d = r.nextInt(c);
							stmt.executeUpdate("insert into 매치(여자, 남자) values('" + StaticV.user + "', '" + Array2[d] + "');");
							System.out.println("===============================================================================================================");
							System.out.println("					    The L♡ver");
							System.out.println("===============================================================================================================");
							System.out.println("매치진행중>>>");
							System.out.println("매치진행중>>>");
							System.out.println("매치진행중>>>");
							System.out.println(Array2[d] + "님과 매치되었습니다♥");
							stmt.executeUpdate("update 회원매치정보 set 횟수 = 0;");
	
						}
						
						conn.close();
					}
					catch (ClassNotFoundException e) {
						System.out.println("JDBC 드라이버 로드 에러");
					
					}
					catch (SQLException e) {
						System.out.println("DB 연결 오류8");
					}		
					conn.close();
				}
				catch (ClassNotFoundException e) {
					System.out.println("JDBC 드라이버 로드 에러");
				} 
				catch (SQLException e) {
					System.out.println("DB 연결 오류9");
				}		
					 
			} 
				

				// 남자일떄 여자 검색
			else {
				Connection conn; 
				Statement stmt = null;
					//키
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");		
					conn = DriverManager.getConnection("jdbc:ucanaccess://d:/Team13/Database.accdb");
					stmt = conn.createStatement();
					ResultSet C = stmt.executeQuery("select * from 회원매치정보 where 성별='여' and 지역='" + styleRg + "' and 키='" + styleH + "';");
					while (C.next()) {
						String iiid = C.getString("ID");
						int cnt = C.getInt("횟수");
						cnt = cnt + 1;
						stmt.executeUpdate("update 회원매치정보 set 횟수 =" + cnt + " where ID='" + iiid + "';");
					}
						
				}
				catch (ClassNotFoundException e) {
					System.out.println("JDBC 드라이버 로드 에러");
				} 
				catch (SQLException e) {
					System.out.println("DB 연결 오류11");
				}
					//직업
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");		
					conn = DriverManager.getConnection("jdbc:ucanaccess://d:/Team13/Database.accdb");
					stmt = conn.createStatement();
					ResultSet C = stmt.executeQuery("select * from 회원매치정보 where 성별='여' and 지역='" + styleRg + "' and 직업='" + styleJ + "';");
					while (C.next()) {
						String iiid = C.getString("ID");
						int cnt = C.getInt("횟수");
						cnt = cnt + 1;
						stmt.executeUpdate("update 회원매치정보 set 횟수 =" + cnt + " where ID='" + iiid + "';");
					}
				}
				catch (ClassNotFoundException e) {
					System.out.println("JDBC 드라이버 로드 에러");
				} 
				catch (SQLException e) {
					System.out.println("DB 연결 오류12");
				}
					//성격
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");		
					conn = DriverManager.getConnection("jdbc:ucanaccess://d:/Team13/Database.accdb");
					stmt = conn.createStatement();
					ResultSet C = stmt.executeQuery("select * from 회원매치정보 where 성별='여' and 지역='" + styleRg + "' and 성격='" + styleC + "';");
					while (C.next()) {
						String iiid = C.getString("ID");
						int cnt = C.getInt("횟수");
						cnt = cnt + 1;
						stmt.executeUpdate("update 회원매치정보 set 횟수 =" + cnt + " where ID='" + iiid + "';");
					}
				}
				catch (ClassNotFoundException e) {
					System.out.println("JDBC 드라이버 로드 에러");
				} 
				catch (SQLException e) {
					System.out.println("DB 연결 오류13");
				}
					//음주여부
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");		
					conn = DriverManager.getConnection("jdbc:ucanaccess://d:/Team13/Database.accdb");
					stmt = conn.createStatement();
					ResultSet C = stmt.executeQuery("select * from 회원매치정보 where 성별='여' and 지역='" + styleRg + "' and 음주여부='" + styleS + "';");
					while (C.next()) {
						String iiid = C.getString("ID");
						int cnt = C.getInt("횟수");
						cnt = cnt + 1;
						stmt.executeUpdate("update 회원매치정보 set 횟수 =" + cnt + " where ID='" + iiid + "';");
					}
				}
				catch (ClassNotFoundException e) {
					System.out.println("JDBC 드라이버 로드 에러");
				} 
				catch (SQLException e) {
					System.out.println("DB 연결 오류14");
				}
					//흡연여부
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");		
					conn = DriverManager.getConnection("jdbc:ucanaccess://d:/Team13/Database.accdb");
					stmt = conn.createStatement();
					ResultSet C = stmt.executeQuery("select * from 회원매치정보 where 성별='여' and 지역='" + styleRg + "' and 흡연여부='" + styleSm + "';");
					while (C.next()) {
						String iiid = C.getString("ID");
						int cnt = C.getInt("횟수");
						cnt = cnt + 1;
						stmt.executeUpdate("update 회원매치정보 set 횟수 =" + cnt + " where ID='" + iiid + "';");
					}
				}
				catch (ClassNotFoundException e) {
					System.out.println("JDBC 드라이버 로드 에러");
				} 
				catch (SQLException e) {
					System.out.println("DB 연결 오류15 ");
				}
					//종교
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");		
					conn = DriverManager.getConnection("jdbc:ucanaccess://d:/Team13/Database.accdb");
					stmt = conn.createStatement();
					ResultSet C = stmt.executeQuery("select * from 회원매치정보 where 성별='여' and 지역='" + styleRg + "' and 종교='" + styleR + "';");
					while (C.next()) {
						String iiid = C.getString("ID");
						int cnt = C.getInt("횟수");
						cnt = cnt + 1;
						stmt.executeUpdate("update 회원매치정보 set 횟수 =" + cnt + " where ID='" + iiid + "';");
					}
				}
				catch (ClassNotFoundException e) {
					System.out.println("JDBC 드라이버 로드 에러");
				} 
				catch (SQLException e) {
					System.out.println("DB 연결 오류16");
				}
					//데이트스타일
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");		
					conn = DriverManager.getConnection("jdbc:ucanaccess://d:/Team13/Database.accdb");
					stmt = conn.createStatement();
					ResultSet C = stmt.executeQuery("select * from 회원매치정보 where 성별='여' and 지역='" + styleRg + "' and 데이트스타일='" + styleD  + "';");
					while (C.next()) {
						String iiid = C.getString("ID");
						int cnt = C.getInt("횟수");
						cnt = cnt + 1;
						stmt.executeUpdate("update 회원매치정보 set 횟수 =" + cnt + " where ID='" + iiid + "';");
					}
				}
				catch (ClassNotFoundException e) {
					System.out.println("JDBC 드라이버 로드 에러");
				} 
				catch (SQLException e) {
					System.out.println("DB 연결 오류17");
				}
					// 진짜 매치할 사람 찾아주기 (count가 최대인 count 최대값 검색)
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");		
					conn = DriverManager.getConnection("jdbc:ucanaccess://d:/Team13/Database.accdb");
					stmt = conn.createStatement();
					ResultSet rs2 = stmt.executeQuery("select * from 회원매치정보;");
					//전체 회원수(배열크기)
					int rowcount = 0;
					while (rs2.next()) {
						rowcount = rowcount + 1;
					}
					//전체 회원수 크기의 배열
					int Array[] = new int [rowcount];
					ResultSet rs3 = stmt.executeQuery("select * from 회원매치정보;");
					//전체 회원테이블의 횟수열만 배열에 저장
					int i = 0;
					while (rs3.next()) {
						Array[i] = rs3.getInt("횟수");
						i++;
					}
					//횟수 배열의 최댓값을 mCount에 저장
					int mCount = Array[0];
					for(int j = 1; j<Array.length; j++) {
						if(Array[j]>= mCount) {
							mCount = Array[j];
						}
					}
					try {
						Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");		
						conn = DriverManager.getConnection("jdbc:ucanaccess://d:/Team13/Database.accdb");
						stmt = conn.createStatement();
						String coup2 = "";
						ResultSet rs = stmt.executeQuery("select * from 회원매치정보 where 횟수=" + mCount + ";");
						//조건에 맞는 레코드의 수를 c에 저장
						int c = 0;
						while (rs.next()) {
							c++;
							coup2 = rs.getString("ID");
						}
						//최댓값이 0 즉, 조건에 맞는 사람이 아무도 없을때
						if(mCount == 0) {
							System.out.println("찾으시는 L♡ver가 존재하지 않습니다.");
						}
						//조건에 맞는 사람이 1명일때
						else if(c == 1) {
							stmt.executeUpdate("insert into 매치(여자, 남자) values('" + coup2 + "', '" + StaticV.user + "');");
							System.out.println("===============================================================================================================");
							System.out.println("					    The L♡ver");
							System.out.println("===============================================================================================================");
							System.out.println("매치진행중>>>");
							System.out.println("매치진행중>>>");
							System.out.println("매치진행중>>>");
							System.out.println(coup2 + "님과 매치되었습니다♥");
							stmt.executeUpdate("update 회원매치정보 set 횟수 = 0; ");
						}
						//조건에 맞는 사람이 다수일때
						//사람수 크기의 배열을 만들어서 그중 랜덤으로 매치
						else if(c > 1) {
							String Array2[] = new String [c];
							ResultSet rs4 = stmt.executeQuery("select * from 회원매치정보 where 횟수=" + mCount + ";");
							int i2 = 0;
							while (rs4.next()) {
								Array2[i2] = rs4.getString("ID");
								i2++;
							}
							int d = r.nextInt(c);
							stmt.executeUpdate("insert into 매치(여자, 남자) values('" + Array2[d] + "', '" + StaticV.user + "');");
							System.out.println("===============================================================================================================");
							System.out.println("					    The L♡ver");
							System.out.println("===============================================================================================================");
							System.out.println("매치진행중>>>");
							System.out.println("매치진행중>>>");
							System.out.println("매치진행중>>>");
							System.out.println(Array2[d] + "님과 매치되었습니다♥");
						//	stmt.executeUpdate("update 회원매치정보 set 횟수 = 0; ");
	
						}
						
						
						conn.close();
					}
					catch (ClassNotFoundException e) {
						System.out.println("JDBC 드라이버 로드 에러");
					
					}
					catch (SQLException e) {
						System.out.println("DB 연결 오류18");
					}		
					conn.close();
				}
				catch (ClassNotFoundException e) {
					System.out.println("JDBC 드라이버 로드 에러");
				} 
				catch (SQLException e) {
					System.out.println("DB 연결 오류19");
				}	
				
			}
	}
}
