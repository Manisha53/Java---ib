public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {
        int n=a.size();
        int count=1;
        if(n==0 || a==null){
            return 0;
        }
        for(int i=1;i<n;i++){
            if(a.get(i).intValue() != a.get(i-1).intValue()){
                a.set(count,a.get(i));
                count++;
            }
        }
       return count; 
    }
}
