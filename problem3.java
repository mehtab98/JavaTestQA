import java.util.Scanner;  

public class ProblemThree {
		
	public static void main(String[] args) { 	
		int n, sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();

        int a[] = new int[n];
        for(int i = 0; i < n; i++){
        		System.out.println("Enter element into the array:");
            a[i] = s.nextInt();
        }
        
        double inf = Double.POSITIVE_INFINITY;
        
        double first = inf * -1;
        	double second =inf * -1;
        	double third =inf * -1;
        int index = 0; 
        for (int element: a) {
            if(element > first) {

            	 	if(index ==0) {
            	 		
            	 		first = element; 
            	 		
            	 	}else {
            	 		third = second;
            	 		second = first;
            	 		
            	 		first = element; 
            	 		
            	 	}
	        		
            }   
            else if(element > second) {
            		third = second;
        			second = element; 
        			
            }
            else if(element > third) { 
              	
            		third = element; 
            }
            index = index + 1;
        }
        

	}
}