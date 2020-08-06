import java.util.*;  

public class ProblemTwo {
	
	public static void main(String[] args) { 	
		Scanner sc= new Scanner(System.in);  
		int factorial = sc.nextInt();
		int total = 1; 
		while(factorial > 1) {
			total = total * factorial; 
			factorial = factorial -1; 
		}
		
		System.out.println(total);
	}
}
