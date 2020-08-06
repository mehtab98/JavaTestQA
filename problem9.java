import java.util.Scanner;  

public class ProblemNine{

	
	public static String value(char r) { 
        if (1 == Character.getNumericValue(r)) 
        		return "one"; 
        if (2 == Character.getNumericValue(r)) 
            return "two"; 
        if (3 == Character.getNumericValue(r)) 
            return "three"; 
        if (4 == Character.getNumericValue(r)) 
            return "four"; 
        if (5 == Character.getNumericValue(r)) 
            return "five"; 
        if (6 == Character.getNumericValue(r)) 
            return "six";
        if (7 == Character.getNumericValue(r)) 
            return "seven";
        if (8 == Character.getNumericValue(r)) 
            return "eight";
        if (9 == Character.getNumericValue(r)) 
            return "nine"; 
        if (0 == Character.getNumericValue(r)) 
        		return "zero";
        
        return "null";
    } 
	

	
	public static void main(String[] args) { 	
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a number:"); 
		
		
		String scanned_int = sc.next();
		String number = String.valueOf(scanned_int);
		char[] digits1 = number.toCharArray();
		
		
		int size = digits1.length;
		String[] finalArray = new String[size]; 
		
		String final_sentence ="";
		for(char num:digits1) {
			String numWord = ProblemNine.value(num);
			final_sentence = final_sentence+" "+ numWord;
		}
		
		System.out.println(final_sentence);
		
	}
}