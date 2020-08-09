package wk02;

import java.util.ArrayList;
import java.util.List;

/**
 * 144. 二叉树的前序遍历
 * 
 * @author Joe
 *
 */
class PreorderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		preorder(result, root);
		return result;
	}

	private void preorder(List<Integer> result, TreeNode root) {
		if(root == null) {
			return;
		}
		result.add(root.val);
		preorder(result, root.left);
		preorder(result, root.right);
	}
}

