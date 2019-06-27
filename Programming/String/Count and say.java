public class Solution {
    public String countAndSay(int n) {
        if(n==1)  return "1";
        if(n==2)  return "11";
        
        String s="11";
        for(int i=3;i<=n;i++){
            
            s+="$";         //dummy value
            int len=s.length();
            int c=1;
            String t="";
            char a[]=s.toCharArray();
            
            for(int j=1;j<len;j++){
                
                if(a[j]!=a[j-1]){
                    t=t+c;
                    t=t+a[j-1];
                    c=1;
                }
                else{
                    c++;
                }
            }
           s=t; 
        }
        return s;
    }
}
