public class LC409 {
    public int longestPalindrome(String s) {

        int[] count = new int[128];
        for (char c : s.toCharArray()){
            count[c]++;
        }

        int length = 0;
        boolean oddFound = false;

        for (int val : count) {
            length += val / 2 * 2;
            if (val % 2 == 1) oddFound = true;
        }

        if (oddFound) length++;
        return length;

    }
}
