package algo.tree;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class BSTLevelOrderTraversal {

	static void levelOrder(TreeNode root) {
		
		Queue<TreeNode> bstQueue= new ArrayBlockingQueue<>(10);
		// Write your code here
		if (null == root) {
			return;
		}
		bstQueue.add(root); // Add root node to the queue
		
		while (!bstQueue.isEmpty()) { // To traverse the BST till the queue is not empty
							
			TreeNode current=bstQueue.peek(); // Get the current node form the queue
			System.out.printf("%d ",current.data);
			if (null != current.left) {
				bstQueue.add(current.left);
			}
			if (null != current.right) {
				bstQueue.add(current.right);
			}
			bstQueue.poll();
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
		levelOrder(root);
	}
}
