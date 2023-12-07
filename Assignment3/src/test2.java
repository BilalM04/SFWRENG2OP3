public class test2 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s) {
        String longestSubstring = "";
        String currentSubstring = "";
        int currentStart = 0;

        for (int i = 0; i < s.length(); i++) {

            if (currentSubstring.indexOf(s.charAt(i)) == -1) {
                currentSubstring += s.charAt(i);
            } else {
                if (currentSubstring.length() > longestSubstring.length()) {
                    longestSubstring = currentSubstring;
                    currentStart++;
                    i = currentStart - 1;
                }
                currentSubstring = "" + s.charAt(i);
            }

        }

        if (currentSubstring.length() > longestSubstring.length()) {
            longestSubstring = currentSubstring;
        }

        return longestSubstring.length();
    }
}
