/*
Write a function that takes an unsigned integer and returns the number of 1 bits it has.

Example:

The 32-bit integer 11 has binary representation

00000000000000000000000000001011
so the function should return 3.

Note that since Java does not have unsigned int, use long for Java
*/

public class Solution {
    public int numSetBits(long a) {
         String str = Long.toBinaryString(a);
         int c=0;
         for(int i=0;i<str.length();i++){
             if(str.charAt(i)=='1'){
                 c++;
             }
         }
        return c;
    }
}
 
