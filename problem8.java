import java.util.Scanner;  

public class ProblemEight{

	
	int value(char r) { 
        if (r == 'I') 
            return 1; 
        if (r == 'V') 
            return 5; 
        if (r == 'X') 
            return 10; 
        if (r == 'L') 
            return 50; 
        if (r == 'C') 
            return 100; 
        if (r == 'D') 
            return 500; 
        if (r == 'M') 
            return 1000; 
        return -1; 
    } 
	
	int romanToDecimal(String str) {
		int sum = 0; 
		for (int i = 0; i < str.length(); i++) { 
            // Getting value of symbol s[i] 
            int s1 = value(str.charAt(i)); 
  
            // Getting value of symbol s[i+1] 
            if (i + 1 < str.length()) { 
                int s2 = value(str.charAt(i + 1)); 
  
                // Comparing both values 
                if (s1 >= s2) { 
                    // Value of current symbol 
                    // is greater or equal to 
                    // the next symbol 
                    sum = sum + s1; 
                } 
                else { 
                    // Value of current symbol is 
                    // less than the next symbol 
                    sum = sum + s2 - s1; 
                    i++; 
                } 
            } 
            else { 
                sum = sum + s1; 
                i++; 
            } 
        } 
		
		System.out.println(sum);
        return sum; 
        
	}
	
	public static void main(String[] args) { 	
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a Roman Numerial:"); 
		
		ProblemEight ob = new ProblemEight(); 
		  
		String scanned_string = sc.nextLine(); 
		ob.romanToDecimal(scanned_string);
		
		
	}
}