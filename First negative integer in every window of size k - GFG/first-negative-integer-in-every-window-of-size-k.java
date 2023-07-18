//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        ArrayList<Long> list = new ArrayList<>();
        Queue<Long> queue = new LinkedList<>();
        int i = 0;
        
        for (int j = 0; j < A.length; j++) {
            if (A[j] < 0) {
                queue.add(A[j]);
            }
            
            if (j - i + 1 == K) {
                if (queue.isEmpty()) {
                    list.add(0L);
                } else {
                    list.add(queue.peek());
                    if (A[i] <0) {
                        queue.remove();
                    }
                }
                i++;
            }
        }
        
        long[] longArray = new long[list.size()];
        
        for (int k = 0; k < list.size(); k++) {
            longArray[k] = list.get(k);
        }
        
        return longArray;
    }
}