/*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example:

Given the array [-2,1,-3,4,-1,2,1,-5,4],

the contiguous subarray [4,-1,2,1] has the largest sum = 6.

For this problem, return the maximum sum.
*/


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int i,count=0;
        int max=Integer.MIN_VALUE;
        for(i=0;i<A.size();i++){
            count = count + A.get(i);

        if (count > max) {
            max = count;
        }
                                      // If count is negative, we simply get rid of the past
        if (count < 0) {
            count = 0;
        }
    }
    return max;
            
        }
    }
