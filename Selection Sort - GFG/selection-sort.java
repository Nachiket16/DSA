//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends




class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int small = Integer.MAX_VALUE;
        int pos = i;
        for(int j = i; j<arr.length; j++){
            if(small>arr[j]){
                small = arr[j];
                pos = j;
            }
        }
        return pos;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    int temp = 0; 
	    for(int i=0; i<n ; i++){
	       int pos = select(arr,i);
	       temp = arr[i];
	       arr[i] = arr[pos];
	       arr[pos] = temp;
	    }
	}
}