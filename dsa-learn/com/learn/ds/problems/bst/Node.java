package com.learn.ds.problems.bst;

public class Node {
	private int data;
	private Node right;
	private Node left;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}

}
