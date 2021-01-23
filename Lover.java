import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Lover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("===============================================================================================================");
			System.out.println("					  The L♡ver 방문을 환영합니다!");
			System.out.println("===============================================================================================================\n");
			System.out.println("						옵션을 선택하세요.\n");
			System.out.println("				    	  1: 회원가입 2: 로그인 3: 종료");
			System.out.println("---------------------------------------------------------------------------------------------------------------");
			int op = s.nextInt();
			
			if(op == 1) {			
				Join join = new Join();
			    Matchinfo matchinfo = new Matchinfo();
			    Match match = new Match();
			    break;
			}
			else if(op == 2) {
				Login login = new Login();
			    Matchinfo matchinfo = new Matchinfo();
			    Match match = new Match();
			    break;
			}
			else if(op == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
				
			}
		}
		
	    
	}

}
