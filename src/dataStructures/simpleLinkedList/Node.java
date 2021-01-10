package dataStructures.simpleLinkedList;

public class Node <T>{
	private T data;
	private Node<T> next;
	
	public Node(T data) {
		this(data,null);
	}
	
	public Node(T data,Node<T> nx) {
		this.data = data;
		this.next = nx;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return ""+this.data;
	}
}
