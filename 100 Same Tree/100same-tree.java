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
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(q == null && p == null){
            return true;
        }
        if (q == null || p == null){
            return false;
        }
         if (q.val != p.val){
            return false;
        }

        if (check(q.left, p.left) && check(q.right, p.right)){
            return true;
        } 
        return false;

    }

    public boolean check(TreeNode q, TreeNode p){
          
        if (q == null && p == null){
            return true;
        }
        if (q == null || p == null){
            return false;
        }


        if (q.val == p.val){
            return check(q.left, p.left) && check(q.right, p.right);
        }
        return false;
    }
    
    
}