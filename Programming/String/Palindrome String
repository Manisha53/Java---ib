public class Solution {
    public int isPalindrome(String A) {
        
        char a[]=A.toLowerCase().toCharArray();
        int j=a.length-1;
        int i=0;
        while(i<j){
            if(!((a[i]>='a' && a[i]<='z') || (a[i]>='0' && a[i]<='9'))){
                i++;
                continue;
            }
            if(!((a[j]>='a' && a[j]<='z') || (a[j]>='0' && a[j]<='9'))){
                j--;
                continue;
            }
            if(a[i++]!=a[j--]){
                return 0;
            }
        }
        return 1;
}
}
