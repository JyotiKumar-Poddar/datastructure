package algo.tree;

import java.util.Scanner;



/**
 * 
 * @author jyotipoddar
 *
 */

public class BinarySearchTreeFindHight {

	public static int getHeight(TreeNode root) {
		
		if (null == root) {
			return -1;
		} else {
			int left = getHeight(root.left);
			int right = getHeight(root.right);
			if (left > right) {
				return (left + 1);
			} else {
				return (right + 1);
			}
		}
		
	}

	public static TreeNode insert(TreeNode root, int data) {
		if (root == null) {
			return new TreeNode(data);
		} else {
			TreeNode cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		TreeNode root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		sc.close();
		int height = getHeight(root);
		System.out.println(height);
	}
}
