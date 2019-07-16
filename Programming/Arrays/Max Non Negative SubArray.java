public class Solution {

    public ArrayList<Integer> maxset(List<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> copy = new ArrayList<>();
        long sum = 0;
        long temp = 0;

        for (int num : A) {
            if (num >= 0) {
                temp += num;
                copy.add(num);
            }
            else {
                temp = 0;
                copy.clear();
            }
            
            if (temp > sum || (temp == sum && res.size() < copy.size())) {
                sum = temp;
                res.clear();
                res.addAll(copy);
            }
        }

        return res;
    }
}
