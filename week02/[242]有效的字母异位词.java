package leetcode.editor.cn;//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
//
// 示例 1: 
//
// 输入: s = "anagram", t = "nagaram"
//输出: true
// 
//
// 示例 2: 
//
// 输入: s = "rat", t = "car"
//输出: false 
//
// 说明: 
//你可以假设字符串只包含小写字母。 
//
// 进阶: 
//如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？ 
// Related Topics 排序 哈希表 
// 👍 267 👎 0


import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class 有效的字母异位词 {
    public static void main(String[] args) {
        有效的字母异位词 current = new 有效的字母异位词();
        boolean anagram = current.isAnagram("anagram", "nagaram");
        System.out.println(anagram);

    }

    /**
     * 使用数组计数器
     * 别遗漏边界值条件！if (s.length() != t.length()) {
     * @创建人 ls
     * @创建时间 2020/10/31 21:05
     */

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a'] ++;
            count[t.charAt(i) - 'a'] --;
        }
        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }

//    /**
//     * 使用排序
//     * @创建人 ls
//     * @创建时间 2020/10/31 21:04
//     */
//
//    public boolean isAnagram(String s, String t) {
//
//        char[] sChar = s.toCharArray();
//        char[] toCharArray = t.toCharArray();
//        Arrays.sort(sChar);
//        Arrays.sort(toCharArray);
//        return new String(sChar).equals(new String(toCharArray));
//    }
}
//leetcode submit region end(Prohibit modification and deletion)
