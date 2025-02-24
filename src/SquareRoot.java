package src;

import javax.swing.text.Style;

public class SquareRoot {
    public static void main(String[] args) {
        SquareRoot sqrt = new SquareRoot();
        sqrt.mySqrt(8);
    }
    public int mySqrt(int x) {
        if (x < 2) return x; // Handle base cases directly

        int low = 1, high = x / 2;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long val = mid * mid;

            if (val == x) {
                return (int) mid;
            } else if (val < x) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }

        return high;
    }
}
