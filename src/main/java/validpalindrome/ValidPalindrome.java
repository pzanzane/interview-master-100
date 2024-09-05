package validpalindrome;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        if (s.length() <= 1) {
            return false;
        }

        char[] chars = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase().toCharArray();

        int length = chars.length;

        int lastIndex = length - 1;
        for (int index = 0; index < length/2; index++) {

            if (chars[index] != chars[lastIndex - index]) {
                return false;
            }
        }
        return true;
    }
}
