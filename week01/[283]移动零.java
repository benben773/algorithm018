package leetcode.editor.cn;//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针 
// 👍 773 👎 0


import org.junit.Test;

import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class test {
    public static void main(String[] args) {
        test test = new test();
        int[] input ={0,1,0,3,12};
        test.moveZeroes(input);
        System.out.println(Arrays.toString(input));
    }

    /**
     * @创建人 ls
     * @创建时间 2020/10/21 12:35
     */

    public void moveZeroes(int[] nums) {

        int first = 0; int second =0;

        for (int num : nums) {
            if (num != 0) {
                nums[first++] = num;
            }
        }
        for (int i = first; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
//    public void moveZeroes(int[] nums) {
//
//        int notZeroIndex = 0;
//        for (int num : nums) {
//            if (num != 0) {
//                nums[notZeroIndex++] = num;
//            }
//        }
//        for (;notZeroIndex< nums.length;notZeroIndex++){
//            nums[notZeroIndex] = 0;
//        }
//
//    }
}
//leetcode submit region end(Prohibit modification and deletion)
