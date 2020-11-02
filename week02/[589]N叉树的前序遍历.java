package leetcode.editor.cn;//给定一个 N 叉树，返回其节点值的前序遍历。
//
// 例如，给定一个 3叉树 : 
//
// 
//
// 
//
// 
//
// 返回其前序遍历: [1,3,5,6,2,4]。 
//
// 
//
// 说明: 递归法很简单，你可以使用迭代法完成此题吗? Related Topics 树 
// 👍 109 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


import java.util.List;

class N叉树的前序遍历 {
    public static void main(String[] args) {
        N叉树的前序遍历 current = new N叉树的前序遍历();
        List<Node> list = new LinkedList<>();
        Node e = new Node(2);
        list.add(e);
        list.add(e);
        List<Integer> preorder = current.preorder(new Node(1, list));
        preorder.forEach(System.out::print);
    }

    /**
     * @创建人 ls
     * @创建时间 2020/10/29 23:33
     */

    public List<Integer> preorder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        preorderThis(root, result);
        return  result;
    }

    private void preorderThis(Node root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        root.children.forEach(node -> {
            preorderThis(node, result);
        });

    }

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;
}
//leetcode submit region end(Prohibit modification and deletion)
