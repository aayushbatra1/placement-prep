public class LC557 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++){
            StringBuilder sb = new StringBuilder(words[i]);
            sb.reverse();
            words[i] = sb.toString();
        }
        return String.join(" ", words);
    }
}
