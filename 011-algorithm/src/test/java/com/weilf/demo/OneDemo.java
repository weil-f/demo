package com.weilf.demo;

import com.weil.demo.Node;

/**
 * @author weil-f
 * @date 2021/1/26 11:16
 */
public class OneDemo {
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		System.out.println(node1);
		Node node = reverseLinkedList(node1);
		System.out.println(node);

	}

	/**
	 * 换头函数
	 * @param head
	 * @return
	 */
	public static Node reverseLinkedList(Node head) {
		Node pre = null;
		Node next = null;
		while (head != null) {
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}
}
