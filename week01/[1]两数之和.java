package leetcode.editor.cn;//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那
// 两个 整数，并返回他们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表 
// 👍 9396 👎 0


import java.util.Arrays;
import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class 两数之和 {
    public static void main(String[] args) {
        int[] ints = {2, 7, 11, 15};
        两数之和 sum2 = new 两数之和();
        int[] ints1 = sum2.twoSum(ints, 9);

//        int[] ints = {3, 2, 4};
//        两数之和 sum2 = new 两数之和();
//        int[] ints1 = sum2.twoSum(ints, 6);
        System.out.println(Arrays.toString(ints1));
    }
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {

            map.put(nums[i], i);
        }
        for (int num : nums) {
            if (map.containsKey(target - num)) {
                return new int[]{map.get(num),map.get(target - num)};
            }
        }
        return null;
    }
//    public int[] twoSum(int[] nums, int target) {
//
//        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            int thisNumZ = nums[i];
//            int theOtheValue = target - thisNum;
//            if (map.containsKey(theOtheValue)) {
//                return new int[]{map.get(thisNum), map.get(theOtheValue)};
//            }
//        }
//
//        return null;
//    }
}
//leetcode submit region end(Prohibit modification and deletion)
