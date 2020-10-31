package leetcode.editor.cn;
//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
// 使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
//
// 注意：答案中不可以包含重复的三元组。
//
// 示例： 
//
// 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
// 
// Related Topics 数组 双指针 
// 👍 2690 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class 三数之和 {
    public static void main(String[] args) {
        int[] num = {-1, 0, 1, 2, -1, -4};
//        int[] num = {1,-1,-1,0};
//        int[] num = {3,0,-2,-1,1,2};
        三数之和 threeSum = new 三数之和();
        List<List<Integer>> lists = threeSum.threeSum(num);
        lists.stream().forEach(list ->{
            list.stream().forEach(System.out::println);
        });
    }

    /**
     * 注意这两块的表述！
     * // 需要保证 b 的指针在 c 的指针的左侧
     *                 while (second < third && nums[first]  + nums[second] + nums[third] > 0) {
     *                     --third;
     *                 }
     *                 // 就不会有满足 a+b+c=0 并且 b<c 的 c 了，可以退出循环
     *                 if (second == third) {
     *                     break;
     *                 }
     * @创建人 ls
     * @创建时间 2020/11/1 7:28
     */

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(nums);
        for (int first = 0; first < nums.length; first++) {
            if (first > 0 && nums[first - 1] == nums[first]) {
                continue;
            }

            int third = nums.length - 1;
            for (int second = first+1; second < nums.length; second++) {
                if (second > first+1 && nums[second - 1] == nums[second]) {
                    continue;
                }
                // 需要保证 b 的指针在 c 的指针的左侧
                while (second < third && nums[first]  + nums[second] + nums[third] > 0) {
                    --third;
                }
                // 就不会有满足 a+b+c=0 并且 b<c 的 c 了，可以退出循环
                if (second == third) {
                    break;
                }
                if (nums[first] + nums[second] + nums[third] == 0) {
                    List<Integer> current = new LinkedList<>();
                    current.add(nums[first]);
                    current.add(nums[second]);
                    current.add(nums[third]);
                    result.add(current);
                }
            }
        }
        return result;
    }
//    /**
//     * 暴力破解，误区，比较的是 nums[first] ==nums[first+1]
//     * LinkedList<Integer> current = new LinkedList<>(); 放到循环外了！
//     * @创建人 ls
//     * @创建时间 2020/10/27 18:52
//     */
//
//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> result = new LinkedList<>();
//        Arrays.sort(nums);
//        int length = nums.length ;
//        for (int first = 0; first < length ; first++) {
//            if (first > 1 && nums[first] ==nums[first-1]) {
//                continue;
//            }
//            for (int second = first +1; second < length ; second++) {
//                if (second >first +1 && nums[second] ==nums[second-1]) {
//                    continue;
//                }
//                for (int third = second+1; third < length ; third++) {
//                    if (third> second+1 && nums[third] ==nums[third-1]) {
//                        continue;
//                    }
//                    if (nums[first] + nums[second] + nums[third] == 0) {
//                        LinkedList<Integer> current = new LinkedList<>();
//                        current.add(nums[first]);current.add(nums[second]);current.add( nums[third]);
//                        result.add(current);
//                    }
//                 }
//            }
//
//        }
//        return result;
//
//    }

//    /**
//     * @创建人 ls
//     * @创建时间 2020/10/21 11:23
//     */
//
//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> list = new LinkedList<>();
//        Arrays.sort(nums);
//        for (int first = 0; first < nums.length; first++) {
//            if (first>0 && nums[first] == nums[first - 1]) {
//                continue;
//            }
//            for (int second  = first +1; second < nums.length; second++) {
//                if (second > first +1 && nums[second] == nums[second - 1]) {
//                    continue;
//                }
//                for (int third = second +1; third < nums.length; third++) {
//                    if ( third > second +1 && nums[third] == nums[third - 1]) {
//                        continue;
//                    }
//                    if (nums[first] + nums[second] + nums[third] == 0) {
//                        LinkedList<Integer> objects = new LinkedList<>();
//                        objects.add(nums[first]);objects.add(nums[second]);objects.add(nums[third]);
//                        list.add(objects);
//                    }
//                }
//            }
//
//        }
//        return list;
//    }
}
//leetcode submit region end(Prohibit modification and deletion)
