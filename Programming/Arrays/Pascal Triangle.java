/*
Given numRows, generate the first numRows of Pascal’s triangle.

Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

Example:

Given numRows = 5,

Return

[
     [1],
     [1,1],
     [1,2,1],
     [1,3,3,1],
     [1,4,6,4,1]
]
*/

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> fin =new ArrayList<ArrayList<Integer>>();
       
        
        ArrayList<Integer> first=new ArrayList<Integer>();
        
        int i,j;
        if(A==0){         //if no rows
            return fin;
        } 
        first.add(1);       //[1]
        fin.add(first);     //[[1]]
        for(i=1;i<A;i++){
            ArrayList<Integer> pre=fin.get(i-1);          //pre contains previous arraylist 
            ArrayList<Integer> cur=new ArrayList<Integer>(); //initialising current arraylist
            cur.add(1);                                    //[[1][1,...]..]
            for(j=1;j<i;j++){
                 cur.add(pre.get(j-1)+pre.get(j));       
            }
            cur.add(1);                                   //[[1],[1...1]...[1...1]]
            fin.add(cur);                                   
        }
        return fin;
    }
}
