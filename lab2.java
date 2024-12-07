import java.util.Scanner;
public class lab2 {
//Kaleb Thomas
	
	public static final double A= 9.8;
	
	public static final double VALUE = 0.5;

	public static void main(String[] args) {
		
		
		Scanner key=new Scanner(System.in);
		
		System.out.println("Enter the initial velocity (in meters per second) at point A:");
		
		double initial = key.nextDouble();
		
		System.out.println("Enter the time(in seconds) does the ball take to reach point B");
		
		double time = key.nextDouble();
		
		double finalvelocity = initial + (time *A);
		
		System.out.println("Final Velocity V = "+ finalvelocity+ "seconds");
		
		double distance = initial * time + (VALUE * A * Math.pow(time, 2));
		
		System.out.println("distance traveled by the ball S = "+ distance + "meters");
		
	
	}

	
	
	
	
	
	
	
}
