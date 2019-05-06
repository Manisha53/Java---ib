public class Solution {
    public int reverse(int A) {
      long rev = 0;
    while (A != 0) {
        rev = rev * 10 + (A % 10);
        A = A / 10;
    }
    if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
        return 0;
    } else {
        return (int) rev;
    }
    }
}
