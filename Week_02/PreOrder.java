package wk02;

import java.util.ArrayList;
import java.util.List;

/**
 * 589. N²æÊ÷µÄÇ°Ðò±éÀú
 * @author Joe
 *
 */

//Definition for a Node.
class Node {
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
};

public class PreOrder {

	public List<Integer> preorder(Node root) {
		List<Integer> result = new ArrayList<>();
		if(root == null) {
			return result;
		}
		
		result.add(root.val);
		preChildren(result, root.children);
		return result;
	}
	private void preChildren(List<Integer> result ,List<Node> children) {
		if(children == null) {
			return;
		}
		for (Node node : children) {
			result.add(node.val);
			preChildren(result, node.children);
		}
	}
}
