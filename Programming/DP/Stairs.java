public class Solution {
    int dp[];
   
    public int climbStairs(int A) {
        dp=new int[A];
        for(int i=0;i<A;i++){
            dp[i]=-1;
        }
        return Stairs(0,A);
    }
     public int Stairs(int i,int n){   //i=position and n=steps
        
        if(i>n) return 0;
        if(i==n) return 1;
        if(dp[i] != -1) return dp[i];
        
        dp[i]=Stairs(i+1,n)+Stairs(i+2,n);
        return dp[i];
    }
    
}
