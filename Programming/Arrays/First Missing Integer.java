/*Given an unsorted integer array, find the first missing positive integer.

Example:

Given [1,2,0] return 3,

[3,4,-1,1] return 2,

[-8, -7, -6] returns 1

Your algorithm should run in O(n) time and use constant space.
*/


public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        int len = A.size();
        for (int i = 0; i < len; i++) {
            // swap until A[i] == i + 1 or we met negative number
            while (A.get(i) != (i + 1) || A.get(i) <= 0) {
                // swap A[i] with A[A[i] - 1]
                int cur = A.get(i);
                int index = cur - 1;
                // watch here ! test index within boundary first
                if ((index < 0 || index >= len) || cur == A.get(cur - 1)) {
                    // duplicated number
                    break;
                }
                // swap
                A.set(i, A.get(cur - 1));
                A.set(cur - 1, cur);
            }
        }
        // find the missing integer
        for (int i = 0; i < len ; i++) {
            if (A.get(i) != i + 1) {
                // found missing
                return i + 1;
            }
        }
        // no missing number
        return len + 1;
    }
}

