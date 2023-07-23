//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> sol = new ArrayList<>();
        
        //find first occ, then last occ of x in n size array
        // appro 1: need to iterate the array and store the position of the x
        // then we can break the  loop reve iteration and store the occ and return the soln

        for(int i=0; i<n; i++){
            if(arr[i]==x){
                sol.add(Long.valueOf(i));
                break;
            }
        }
        for(int i=n-1; i>=0; i--){
            if(arr[i]==x){
                sol.add(Long.valueOf(i));
                break;
            }
        }
        if(sol.size() == 0){
            sol.add(Long.valueOf(-1));
            sol.add(Long.valueOf(-1));
        }
        return sol;
    }
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(a1[i]);
            }
            Kth_smallest ob = new Kth_smallest();
            ArrayList<Long> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}

// } Driver Code Ends