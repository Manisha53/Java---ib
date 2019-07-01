public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        int l1=A.size();
        int l2=B.size();
        int i=0;
        int j=0;
        ArrayList<Integer> res=new ArrayList<Integer>();    
            while(i< l1 && j< l2){
                
                    if((A.get(i)).equals(B.get(j))){
                       res.add(A.get(i)); 
                       i++;
                       j++;
                    }
                    else if(B.get(j)>A.get(i)){
                        i++;
                    }
                    else{
                        j++;
                    }
                }
            
        return res;
    }
}
