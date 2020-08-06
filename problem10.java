import java.util.Scanner;
public class problemTen{
    public static void main(String[] args) {
        int n, x, count = 0, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        
        for(i = 0; i < n; i++){
            a[i] = s.nextInt();
        }
        
        int found[] = new int[n];
        int found_statement = 0;
        for(i = 0; i < n; i++){
        		count = 0;
        		

        		for(x = 0; x < n; x++){
        			
            	   for(int found_occ: found) {
            			if(a[i] == found_occ) {
            				found_statement = 1;
            			}
            		}
            		
            	    if(found_statement == 1) {
            	    		break; 
            	    }
        			if(a[x] == a[i]){
                   count++;
                 }
        			
        		}
        		
        		found[i] = a[i];
        		if(found_statement == 0) {
        			System.out.println( a[i] + " -> occurred " + count +" times" );
        		}
        		found_statement = 0;
        		

        }
        
    }
}