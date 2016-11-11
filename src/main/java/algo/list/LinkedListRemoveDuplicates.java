package algo.list;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}

public class LinkedListRemoveDuplicates {

	public static Node removeDuplicates(Node head) {
		/* Another reference to head */
		Node current = head;

		/* Pointer to store the next pointer of a node to be deleted */
		Node temp;

		/* do nothing if the list is empty */
		if (head == null)
			return head;

		/* Traverse list till the last node */
		while (current.next != null) {

			/* Compare current node with the next node */
			if (current.data == current.next.data) {
				temp = current.next.next;
				current.next = null;
				current.next = temp;
			} else
				// advance if no deletion
				current = current.next;
		}
		return head;
	}

	public static Node insert(Node head, int data) {
		Node p = new Node(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Node start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		sc.close();
		head = removeDuplicates(head);
		display(head);
	}
}
