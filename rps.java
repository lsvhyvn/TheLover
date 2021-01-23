import java.util.Random;
public class rps {
	String re;
	rps() {
		
		Random r = new Random();
		int i = r.nextInt(3);
		
		switch(i) {
		case 0:
			re = "가위";
			break;
		case 1:
			re = "바위";
			break;
		case 2:
			re = "보";
			break;
		}
	}
	String getResult() {return re;}
	
	void next() {
		Random r = new Random();
		int i = r.nextInt(3);
		
		switch(i) {
		case 0:
			re = "가위";
			break;
		case 1:
			re = "바위";
			break;
		case 2:
			re = "보";
			break;
		}
	}
}