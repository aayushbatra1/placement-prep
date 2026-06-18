public class LC125 {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        String cleaned = sb.toString().toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}
