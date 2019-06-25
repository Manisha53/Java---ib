public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        
        String s=A.trim();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                c=0;
            }
            else{
                c++;
            }
        }
        // String a[]=A.split("//s+");
        // int c=0;
        // int len=a.length;
        // String last=a[len-1];
        // //System.out.println(last);
        // // if(last!=isalpha){
        // //     return 0;
        // // }
        // for(int i=0;i<last.length();i++){
        //     // if(last.charAt(i)==' '){
        //     //     c=0;
        //     // }
        //     c++;
        // }
        return c;
    }
}
