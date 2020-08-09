package wk02;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 * @author Joe
 *
 */
public class InorderTraversal {

	public List<Integer> inorderTraversal(TreeNode root) {
		
		List<Integer> result = new ArrayList<>();
		inorder(result,root);
		return result;

	}

	private void inorder(List<Integer> result, TreeNode root) {
		if(root == null) {
			return;
		}
		inorder(result, root.left);
		result.add(root.val);
		inorder(result, root.right);
	}
}

// Definition for a binary tree node.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
