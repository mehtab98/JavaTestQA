import java.util.Scanner;  

public class ProblemSix{
	public static String reversed(String str) {
		char ch[] = str.toCharArray();
		int n = ch.length; 
		
		char result[] = new char[n]; 
		for(int i = 0; i < ch.length; i++) {
			result[n-1] = ch[i];
			n = n - 1; 
		}
		
		return new String(result); 
	}
	
	public static void main(String[] args) { 	
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a string"); 
		String scanned_string = sc.next(); 
		String result = ProblemSix.reversed(scanned_string); 
		System.out.println("Result: \n");
		System.out.println(result);
	}
}