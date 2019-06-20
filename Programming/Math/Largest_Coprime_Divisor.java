/*

Largest Coprime Divisor

You are given two positive numbers A and B. You need to find the maximum valued integer X such that:

    X divides A i.e. A % X = 0
    X and B are co-prime i.e. gcd(X, B) = 1

For example,

A = 30
B = 12
We return
X = 5

*/

public class Solution {
    public int cpFact(int x, int y) {
        int result=1;
       for(int i=1;i<=Math.max(x,y);i++){
           if(x%i==0 && gcd(i,y)==1){
               result=i;
           }
           
       }
       return result;
    }
    
    public int gcd(int A, int B) {
        if (B == 0) return A;
        return gcd(Math.min(A,B), Math.max(A,B)%Math.min(A, B));
    }
}
