package leetcode.editor.cn;//给定一个二叉树，返回它的中序 遍历。
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
//输出: [1,3,2] 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 哈希表 
// 👍 754 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

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
class 二叉树的中序遍历 {

    public static void main(String[] args) {
        //     3
        //   / \
        //  9  20
        //    /  \
        //   15   7
        二叉树的中序遍历 order = new 二叉树的中序遍历();
        TreeNode travel = order.genNodeTree();
        List<Integer> lists = order.inorderTraversal(travel);
        lists.stream().forEach(integer -> System.out.println(integer));

    }
    private TreeNode genNodeTree() {
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
    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        inorderTraversalThis(root, result);
        return result;
    }

    private void inorderTraversalThis(TreeNode current, LinkedList<Integer> result) {
        if (current == null) {
            return;
        }
        inorderTraversalThis(current.left, result);
        result.add(current.val);
        inorderTraversalThis(current.right, result);
    }
//    public List<Integer> inorderTraversal(TreeNode root) {
//
//        LinkedList<Integer> result = new LinkedList<>();
//        inorderTraversal1(root, result);
//        return result;
//    }
//
//    private void inorderTraversal1(TreeNode root, LinkedList<Integer> result) {
//        if (root == null) {
//            return ;
//        }
//        inorderTraversal1(root.left,result);
//        result.add(root.val);
//        inorderTraversal1(root.right,result);
//    }
}
//leetcode submit region end(Prohibit modification and deletion)
