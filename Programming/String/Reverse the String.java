/*


Given an input string, reverse the string word by word.

Example:

Given s = "the sky is blue",

return "blue is sky the".

        A sequence of non-space characters constitutes a word.
        Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
        If there are multiple spaces between words, reduce them to a single space in the reversed string.

*/

public class Solution {
    public String reverseWords(String a) {
        int c=0;
       
        
        String s[]=a.trim().split("\\s+");
        List<String> t = new ArrayList<>();
         int n=s.length;
        for(int i=n-1;i>=0;i--){
            
            if(!s[i].isEmpty()){
                t.add(s[i]);
            }
        }
        String b=String.join(" ",t);
        return b;
    }
}
