package com.weil.demo;

import lombok.Data;

/**
 * @author weil-f
 * @date 2021/1/26 11:14
 */
@Data
public class Node {
	public int value;
	public Node next;
	public Node(int data) {
		value = data;
	}

}
