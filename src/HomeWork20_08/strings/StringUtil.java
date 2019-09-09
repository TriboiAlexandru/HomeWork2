package HomeWork20_08.strings;

public class StringUtil {
    static String reverse(String toReverse) {
        String result = "";
        for (int i = toReverse.length()-1; i >=0; i--) {
            result += toReverse.charAt(i);
        }
        return result;
    }

    static String checkForCommonPart(String s1, String s2) {
        String commonPart = "";
        for (int i = 0; i < s1.length() && i < s2.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                commonPart += s1.charAt(i);
                if (!s1.contains(commonPart)) {
                    commonPart = "";
                    break;
                }
            }
        }
        return commonPart;
    }
}
