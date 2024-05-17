package Leetcode;

import javax.swing.tree.TreeNode;
import Leetcode.TreeNode;
public class Leetcode_RemoveLeafNodesWithTarget {
    /**
    * @param root
    * @param target
    * @return
    */
   public TreeNode removeLeafNodes(TreeNode root, int target) {
     if(root == null){
        return null;
     }   
     root.left = removeLeafNodes(root.left, target); 
     root.right= removeLeafNodes(root.right,target); 
     if (root.val==target && root.left==null && root.right==null){
        return null;
     }
     return root; 

    }
}

