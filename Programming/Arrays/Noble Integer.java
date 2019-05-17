/*
Noble Integer
Given an integer array, find if an integer p exists in the array such that the number of integers greater than p in the array equals to p
If such an integer is found return 1 else return -1
*/

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int count=0;
        int flag=-1;
        Collections.sort(A);
        int n=A.size();
        for(int i=0;i<n;i++){
            // for(int j=n;j>=i;j--){
            //     count++;
            // }
            // if(A.get(i)==count){
            //     flag=1;
            // }
            if (i < n-1 && A.get(i) == A.get(i+1)) {  // IN CASE OF DUPLICATES
                continue;
            }
            if(n-i-1==A.get(i)){
                flag=1;
            }
            
        }
        return flag;
    }
}
