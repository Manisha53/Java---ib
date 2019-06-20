/*
Given a string and number of rows ‘n’. Print the string formed by concatenating n rows when input string is written in row-wise Zig-Zag fashion.

Examples:

Input: str = "ABCDEFGH"
       n = 2
Output: "ACEGBDFH"
Explanation: Let us write input string in Zig-Zag fashion
             in 2 rows.
A   C   E   G   
  B   D   F   H
Now concatenate the two rows and ignore spaces 
in every row. We get "ACEGBDFH"

Input: str = "GEEKSFORGEEKS"
       n = 3
Output: GSGSEKFREKEOE
Explanation: Let us write input string in Zig-Zag fashion
             in 3 rows.
G       S       G       S
  E   K   F   R   E   K
    E       O       E
Now concatenate the two rows and ignore spaces 
in every row. We get "GSGSEKFREKEOE"

*/

public class Solution {
    public String convert(String s, int numRows) {
    if (numRows == 1)
        return s;
 
    StringBuilder sb = new StringBuilder();
    // step
    int step = 2 * numRows - 2;
 
    for (int i = 0; i < numRows; i++) {
        //first & last rows
        if (i == 0 || i == numRows - 1) {
            for (int j = i; j < s.length(); j = j + step) {
                sb.append(s.charAt(j));
            }
        //middle rows    
        } else {
            int j = i;
            boolean flag = true;
            int step1 = 2 * (numRows - 1 - i);
            int step2 = step - step1;
 
            while (j < s.length()) {
                sb.append(s.charAt(j));
                if (flag)
                    j = j + step1;
                else
                    j = j + step2;
                flag = !flag;
            }
        }
    }
 
    return sb.toString();
}
}
