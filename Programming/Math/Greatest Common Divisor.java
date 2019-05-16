public class Solution {
    public int gcd(int A, int B) {
    if(A==0){
           return B;
       }
       return gcd(B%A,A);
    }
    }
    
    
    
    
       /*int i,gcd=1; 
       if(A<=B){
             for(i=A;i>=1;i--){
                 if(A%i==0 && B%i==0){
                     gcd=i;
                 }
             }
             return gcd;
        }
        else{
            for(i=B;i>=1;i--){
                 if(A%i==0 && B%i==0){
                     gcd=i;
                 }
             }
            return gcd;
        }
       */
