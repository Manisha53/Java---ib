public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {
        int n=a.size();
        
        int index=0;
        if(n==0 || a==null){
             index=0;
        }
        
        for(int i=0;i<n;i++){
            if(i< n-2 && a.get(i).intValue() == a.get(i+1).intValue() && a.get(i).intValue()==a.get(i+2).intValue()){
                continue;
            }
            else{
                 a.set(index++,a.get(i));
                
            }
            }
        return index;
    }
}
