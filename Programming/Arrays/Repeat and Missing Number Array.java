/*
You are given a read only array of n integers from 1 to n.

Each integer appears exactly once except A which appears twice and B which is missing.

Return A and B.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Note that in your output A should precede B.

Example:

Input:[3 1 2 5 3] 

Output:[3, 4] 

A = 3, B = 4
*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
         
        ArrayList<Integer> B=new ArrayList<Integer>();
        int n=A.size();
      long sum_num = (((long) n) * ((long) n + 1)) / 2;
        long sum_sq = (((long) n) * ((long) n + 1) * ((long) 2*n + 1)) / 6;
        
        for(int i=0;i<n;i++){
            sum_num -= (long) A.get(i);
        }
         for(int i=0;i<n;i++){
            sum_sq -= (long) A.get(i) * (long) A.get(i);
        }
    
        long sum = sum_sq/sum_num;
        
        int missing=(int) (sum+sum_num)/2;
        int repeated=(int) (sum-missing);
        
        B.add(repeated);
        B.add(missing);
        
        return B;
   
    }
}
