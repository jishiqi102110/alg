package wt.com.alg.tree;

import java.util.*;

public class TreeTravel {


    public void preorder(TreeNode root, List<Integer> list) {
        if (root != null) {
            list.add(root.val);
            preorder(root.left, list);
            preorder(root.right, list);
        }
    }

    public void inorder(TreeNode root, List<Integer> list) {
        if (root != null) {
            inorder(root.left, list);
            list.add(root.val);
            inorder(root.right, list);
        }
    }

    public void postorder(TreeNode root, List<Integer> list) {
        if (root != null) {
            postorder(root.left, list);
            postorder(root.right, list);
            list.add(root.val);
        }
    }

    public void preorder(TreeNode root, ArrayList<Integer> list) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            list.add(curr.val);
            if (curr.left != null) {
                stack.push(curr.left);
            }
            if (curr.right != null) {
                stack.push(curr.right);
            }

        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        TreeNode last = null;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.peek();
            if (curr.right == null || curr.right == last) {
                res.add(curr.val);
                stack.pop();
                last = curr;
                curr = null;
            } else {
                curr = curr.right;
            }
        }
        return res;
    }
    public List<Integer> BFS(TreeNode root){
        List<Integer> res = new LinkedList<>();
        // 树的深度优先遍历， 每层用一个临时的queue 来模拟节点进来的优先级
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (queue.size()>0){
            int size=queue.size();
            List<Integer> temp = new LinkedList<>();
            while (size>0){
                root=queue.poll();
                temp.add(root.val);
                size--;
            }
            if (root.left!=null){
                queue.offer(root.left);
            }
            if(root.right!=null){
                queue.offer(root.right);
            }
            res.addAll(temp);
        }
        return  res;
    }
    public static int MaxtreeDeep(TreeNode root){
        if(root==null) return 0;
        return Math.max(MaxtreeDeep(root.left),MaxtreeDeep(root.right))+1;
    }

}



class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
}
