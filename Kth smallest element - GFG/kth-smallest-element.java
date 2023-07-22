//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}

// } Driver Code Ends

/*
1
6
7 10 4 3 20 15
3
 */
//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Approach:1
        // Arrays.sort(arr);
        // return arr[k-1];
		//Approach:2
		int temp = 0; 
        int pos = 0;
        for(int i = 0; i<r; i++){
            int small = Integer.MAX_VALUE;
            for(int j = i; j<arr.length; j++){
                
                if(small>arr[j]){
                    small=arr[j];
                    pos = j;
                }
            }
            temp=arr[i];
            arr[i]=small;
            arr[pos]=temp;
            
         }
        return arr[k-1];
    } 
}
