//{ Driver Code Starts
//Initial Template for Java



//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java




class GFG
{
    long maxSum(long arr[] ,int n)
    {
        //small-big + big -small
        //s b s b
        Arrays.sort(arr);
        int i=0;
        int f=n-1;
        int count=0;
        long sum =0;
        long a[] = new long[n];
        
        while(i<=f){
            if(count%2==0){
                a[count++] =arr[i++];
            }else{
                a[count++] = arr[f--];
            }
        }
        
        for(int j=0; j<n-1; j++){
            sum = sum + Math.abs(a[j]-a[j+1]);
        }
        sum = sum + Math.abs(a[n-1]-a[0]);
        return sum;
        
       
    
        
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
            int n=Integer.parseInt(br.readLine());
//            String line = br.readLine();
//            String[] a2 = line.trim().split("\\s+");
//            int n =Integer.parseInt(a2[0]);
//            int k =Integer.parseInt(a2[1]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long arr[]=new long[n];
            for(int  i=0;i<n;i++)
            {
                arr[i]=Long.parseLong(a1[i]);
            }
            Kth_smallest ob=new Kth_smallest();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            long ans=ob.maxSum(arr,n);
            System.out.println(ans);
        }
    }
}




// } Driver Code Ends