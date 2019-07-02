public class Solution {
    public int removeElement(ArrayList<Integer> a, int b) {
        int l=a.size();
        int c=0;
        for(int i=0;i<l;i++){
            if(a.get(i) != b ){
                if(i!=c){
              a.set(c,a.get(i));
            }
            c++;
            
            }
        }
        return c; 
    }
}
