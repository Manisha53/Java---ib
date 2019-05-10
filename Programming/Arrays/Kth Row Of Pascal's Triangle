/*
Given an index k, return the kth row of the Pascal’s triangle.

Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

Example:

Input : k = 3

Return : [1,3,3,1]
 NOTE : k is 0 based. k = 0, corresponds to the row [1]. 
 */
 
 public class Solution {
    public ArrayList<Integer> getRow(int A) {                       //A =k ,given here
        ArrayList<ArrayList<Integer>> fin= new ArrayList<ArrayList<Integer>>();
        int i,j;
        
        ArrayList<Integer> first = new ArrayList<Integer>();
        first.add(1);
        fin.add(first);
        for(i=1;i<=A;i++){
            ArrayList<Integer> pre = fin.get(i-1);
            ArrayList<Integer> cur = new ArrayList<Integer>();
            cur.add(1);
            for(j=1;j<i;j++){
                cur.add(pre.get(j)+pre.get(j-1));
            }
            cur.add(1);
            fin.add(cur);                                           //final pascal's triangle
        }
        return fin.get(A);                                          //return the arraylist at A'th position in the (arraylist of arraylist)od pascals's triangle
    }
}
