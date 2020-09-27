package leetcode13.algorithm.wk09;

/**
 * 680. 验证回文字符串 Ⅱ
 */
public class HW_680 {
    public boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        int l = 0, r = chars.length - 1;
        while (l < r && chars[l] == chars[r]) {
            l++;
            r--;
        }
        return validHelp(l + 1, r, chars) || validHelp(l, r - 1, chars);
    }

    private boolean validHelp(int l, int r, char[] chars) {
        while (l < r && chars[l] == chars[r]) {
            l++;
            r--;
        }
        return l >= r;
    }

}