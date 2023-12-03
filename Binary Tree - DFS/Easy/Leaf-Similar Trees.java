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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        //first find leaf seq of each tree and 
        //then check if they are equal

        //Create lists for each leaves 
        List<Integer> l1= new ArrayList();
        List<Integer> l2= new ArrayList();
        
        dfs(root1,l1);
        dfs(root2,l2);
        return l1.equals(l2);
    }

    public void dfs(TreeNode node, List<Integer> leaves){
        if(node != null){ //if node null then leafs are null
            if(node.left==null && node.right==null){
                //check if leaf node then add value to list
                leaves.add(node.val);
            }else{
                //check each left n right node
                dfs(node.left,leaves);
                dfs(node.right,leaves);
            }
        }
    }
}
