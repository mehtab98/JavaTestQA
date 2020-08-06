import java.util.Scanner;  

public class ProblemFour{
		
	public static void main(String[] args) { 	
		 Scanner in = new Scanner(System.in);
		 int x,y;
		 
		 System.out.println("Input the first number for x: ");
		 x = in.nextInt();
		 System.out.println("Input the second number for y: ");
		 y = in.nextInt();
		 
		 x = x + y;
		 y = x - y;
		 x = x - y;
		 
		 System.out.println("Swapped value for X: "+x);
		 System.out.println("Swapped value for Y: "+y);
	}
}