public class test {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abbcccbbbcaaccbababcbcabca"));
    }

    public static String longestPalindrome(String s) {
        String longest = "";
        String str;
        int index;
        int right = s.length() - 1;

        if (s.length() == 1) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            while (right > -1) {
                if (right > i) {
                    right = s.substring(i+1, right + 1).lastIndexOf(s.charAt(i));
                } else {
                    right = -1;
                }

                if (right != -1) {
                    right = right + i + 1;
                    str = s.substring(i, right + 1);
                } else {
                    str = "" + s.charAt(i);
                }

                if (str.length() > longest.length()) {
                    if (palindromeChecker(str)) {
                        longest = str;
                    }
                }

                right --;
            }

            right = s.length() - 1;
        }

        return longest;
    }

    public static boolean palindromeChecker(String s) {
        int start = 0;
        int end = s.length() - 1;

        if (s.length() > 0) {
            while (start <= (s.length() - 1)/2) {
                if (s.charAt(start) != s.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
        }

        return true;
    }
}
