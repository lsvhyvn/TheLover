
public class rps_OO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String win;
		if(StaticV.users == "여") {
			
		}
		
		
		rps fe, ma;
		
		fe = new rps();
		ma = new rps();
		System.out.println(fe.getResult());
		System.out.println(ma.getResult());
		
		while(fe.getResult() == ma.getResult()) {
			fe.next();
			ma.next();
			System.out.println(fe.getResult());
			System.out.println(ma.getResult());
		}
		
		if(fe.getResult() == "가위") {
			if(ma.getResult() == "바위") {win = "ma";}
			else {win = "fe";}
		}
		else if(fe.getResult() == "바위") {
			if(ma.getResult() == "보") {win = "ma";}
			else {win = "fe";}
		}
		else{
			if(ma.getResult() == "가위") {win = "ma";}
			else {win = "fe";}
		}
		System.out.println("승자는 " + win + " 입니다!");
	}

}
