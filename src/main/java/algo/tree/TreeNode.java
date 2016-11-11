package algo.tree;


/**
 * Class representation for a node in Tree
 * @author jyotipoddar
 *
 */
public class TreeNode {
	TreeNode left, right;
	int data;

	TreeNode(int data) {
		this.data = data;
		left = right = null;
	}
}
