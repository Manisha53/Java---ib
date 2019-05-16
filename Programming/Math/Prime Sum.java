public class Solution {
    public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> arrli = new ArrayList<Integer>(); 
        for(int j=2;j<A;j++){
            if(isprime(j) && isprime(A-j)){
                arrli.add(j);
                arrli.add(A-j);
                return arrli;
            }
        }
        return arrli;
        
        }
    
    public boolean isprime(int a){
        int val=(int)Math.sqrt(a);
        int i;
        if(a==0||a==1)
        {return false;
        }
        for(i=2;i<=val;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}

