package dataStructures.doublyLinkedList;

public class Node <T>{
	private T data;
	private Node<T> next;
	private Node<T> previous;
	
	public Node(T d) {
		this(d,null,null);
	}
	
	public Node(T d,Node<T> nx) {
		this(d,nx,null);
	}
	
	public Node(T d,Node<T> nx,Node<T> prev) {
		this.data = d;
		this.next = nx;
		this.previous = prev;
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

	public Node<T> getPrevious() {
		return previous;
	}

	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}
	
	@Override
	public String toString() {
		return ""+this.data;
	}

}
