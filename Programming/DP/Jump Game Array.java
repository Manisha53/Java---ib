/*
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

For example:
A = [2,3,1,1,4], return 1 ( true ).

A = [3,2,1,0,4], return 0 ( false ).



*/

public class Solution {
    public int canJump(ArrayList<Integer> A) {
        
        int n=A.size();
    int dp[]=new int[n];
    dp[n-1]=0;
    for(int i=n-2;i>=0;i--){
        if(i+A.get(i)>n-1) {
            dp[i]=n-1;
            continue;
        }
        dp[i]=i+A.get(i);
        for(int j=i+1;j<=i+A.get(i);j++)
         dp[i]=Math.max(dp[i],dp[j]);
    }
    if(dp[0]==n-1)
     return 1;
else return 0;
    }
}
