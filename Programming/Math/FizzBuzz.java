public class Solution {
    public ArrayList<String> fizzBuzz(int A) {
        int i;
        ArrayList<String> l=new ArrayList<String>();
        for(i=1;i<=A;i++){
            if(i%3==0 && i%15!=0) l.add("Fizz");
            if(i%5==0 && i%15!=0 ) l.add("Buzz");
            if(i%15==0) l.add("FizzBuzz");
            else if(i%3 != 0 && i%5!=0 && i%15!=0){
                l.add(i+"");
            }
        }
        //Collections.sort(l);
        return l;
    }
}
