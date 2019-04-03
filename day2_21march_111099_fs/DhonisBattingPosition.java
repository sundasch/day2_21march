package day2_21march_111099_fs;

public class DhonisBattingPosition {
	
	public static void main(String[] args) {
		int overs,ballnumber,totalovers,totaloverscompleted,totalBalls;
		double result;   
		 Scanner scans = Scanner(System.in);
		
		overs = scans.nextInt();
		ballnumber = scans.nextInt();
		totalovers = scans.nextInt();
		result = scans.nextFloat();
		
		System.out.println("What is the number of overs when the last wicket fell?");
		overs = scans.nextInt();
		totaloverscompleted = overs * 6;
		System.out.println("What is the ball in the over when the last wicket fell?");
		ballnumber = scans.nextInt();
		totaloverscompleted = totaloverscompleted + ballnumber; 
		
		System.out.println("What are the total overs in the innings?");
		totalovers = scans.nextInt();
		totalBalls = totalovers * 6;
		
		result = totalBalls * 75/100;
		
		if(result <= totaloverscompleted)
			System.out.println("Dhoni will come to bat");
		else
			System.out.println("Dhoni will not come");
	}
}
