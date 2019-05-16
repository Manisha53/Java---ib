/*Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.

Example :

n = 5
n! = 120 
Number of trailing zeros = 1
So, return 1
*/

public class Solution {
    public int trailingZeroes(int A) {
       
        int count=0;
        while(A!=0){        //since Trailing 0s in n! = Count of 5s in prime factors of n!
                  //= floor(n/5) + floor(n/25) + floor(n/125) + ....
            count+=A/5;
            A/=5;
        }
        return count;  
    }
}
 // long f=fact(A);
    // public long fact(int n){
    //     if(n==0){
    //         return(1);
    //     }
    //     else{
    //         return(n*fact(n-1));
    //     }
    // }
