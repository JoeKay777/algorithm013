package wk02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 429. N²æÊ÷µÄ²ãÐò±éÀú
 * @author Joe
 *
 */
public class LevelOrder {

	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> result = new ArrayList<>();
		if(root == null) {
			return result;
		}
		level(result, Arrays.asList(root));
		return result;
	}

	private void level(List<List<Integer>> result, List<Node> levelNodes) {
		if(levelNodes.isEmpty()) {
			return;
		}
		List<Integer> list = new ArrayList<>();
		List<Node> childNodes = new ArrayList<>();
		for (Node node : levelNodes) {
			list.add(node.val);
			childNodes.addAll(node.children);
		}
		result.add(list);
		level(result, childNodes);
	}
}
