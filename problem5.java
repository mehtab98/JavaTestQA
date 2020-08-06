import java.util.Scanner;
class problemFive{
	
	// Utility function to swap values at two indices in the array
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// Function to perform bubble sort on arr[]
	public static int[] bubbleSort(int[] arr){
		// (arr.length - 1) pass
		for (int k = 0; k < arr.length - 1; k++){
			// last k items are already sorted, so inner loop can
			// avoid looking at the last k items
			for (int i = 0; i < arr.length - 1 - k; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}

			// the algorithm can be stopped if the inner loop
			// didn’t do any swap
		}
		return arr;
	}

	public static void main(String[] args){
		System.out.print("Enter no. of elements you want in array:");
		Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int a[] = new int[n];
	    System.out.println("Enter all the elements:");
	    
	    for(int i = 0; i < n; i++){
	    		a[i] = s.nextInt();
	    }
	    
		
		
		System.out.print("Our sorted Array:\n");
		// print the sorted array
		for(int val: bubbleSort(a)) {
			System.out.println(val);
		}
		
		

	}
	

        
}