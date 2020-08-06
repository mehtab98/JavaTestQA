import java.util.Scanner;  

public class ProblemSeven{
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
		String scanned_string = sc.nextLine(); 
		String[] arrSplit = scanned_string.split("\\s+");
		
		
		int size = arrSplit.length;
		String[] finalArray = new String[size]; 
		
		String final_sentence ="";
		int index = 0; 
		for(String word: arrSplit) {
			String result = ProblemSeven.reversed(word); 
			finalArray[index] = result; 
			final_sentence = final_sentence+" "+ result;
			index = index + 1;
		}
		
		System.out.println("Final String: ");
		
		System.out.println(final_sentence); 
	}
}