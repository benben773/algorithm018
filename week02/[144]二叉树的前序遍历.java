package leetcode.editor.cn;//给定一个二叉树，返回它的 前序 遍历。
//
// 示例: 
//
// 输入: [1,null,2,3]  
//   1
//    \
//     2
//    /
//   3 
//
//输出: [1,2,3]
// 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 
// 👍 387 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import leetcode.editor.cn.二叉树的中序遍历;

import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class 二叉树的前序遍历 {

    public static void main(String[] args) {
        //     3
        //   / \
        //  9  20
        //    /  \
        //   15   7
        二叉树的前序遍历 order = new 二叉树的前序遍历();
        TreeNode travel = order.travel();
        List<Integer> lists = order.preorderTraversal(travel);
        lists.stream().forEach(integer -> System.out.println(integer));

    }
    private TreeNode travel() {
        return new TreeNode(3,
                new TreeNode(9),new TreeNode(20, new TreeNode(15),new TreeNode(7)));
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val =x;
        }
        TreeNode(int x,TreeNode left,TreeNode right) { val = x;this.left=left;
            this.right = right;}
    }
    public List<Integer> preorderTraversal(TreeNode root) {

        LinkedList<Integer> result = new LinkedList<>();
        preorderTraversal1(root, result);
        return result;
    }
    private void preorderTraversal1(TreeNode root, LinkedList<Integer> result) {
        if (root == null) {
            return ;
        }
        result.add(root.val);
        preorderTraversal1(root.left,result);
        preorderTraversal1(root.right,result);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
