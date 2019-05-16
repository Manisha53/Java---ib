/*
You are given an array of N integers, A1, A2 ,…, AN. Return maximum value of f(i, j) for all 1 ≤ i, j ≤ N.
f(i, j) is defined as |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of x.

For example,

A=[1, 3, -1]

f(1, 1) = f(2, 2) = f(3, 3) = 0
f(1, 2) = f(2, 1) = |1 - 3| + |1 - 2| = 3
f(1, 3) = f(3, 1) = |1 - (-1)| + |1 - 3| = 4
f(2, 3) = f(3, 2) = |3 - (-1)| + |2 - 3| = 5

So, we return 5.
*/


public class Solution {
    public int maxArr(ArrayList<Integer> A) {
        /*int i,j,sum=0;
        int m=Integer.MIN_VALUE;
        int n=A.size()-1;
        for(i=0;i<=n;i++){
            for(j=0;j<=n;j++){
                    sum=Math.abs(A.get(i)-A.get(j))+Math.abs(i-j);
                     }
           m=Math.max(sum,m);
        }
        return m;*/
        
        int n=A.size();
        int max1=A.get(0);
        int max2=A.get(0);
        int min1=A.get(0);
        int min2=A.get(0);
        int ans=0;
  for(int i=0;i<n; i++){
    max1=Math.max(max1, A.get(i)+i);
    max2=Math.max(max2, A.get(i)-i);
    min1=Math.min(min1,  A.get(i)+i);
    min2=Math.min(min2, A.get(i)-i);
  }

   ans = Math.max(ans, (max2 - min2));
   ans = Math.max(ans, (max1 - min1));

   return ans;
    }
}
