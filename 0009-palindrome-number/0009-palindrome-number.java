class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int sum = 0; 
        int rem = 0;
        while(temp>0){
            rem=temp%10;
            sum=sum*10+rem;
            temp=temp/10;
        }

        return x==sum?true:false;
        
    }
}