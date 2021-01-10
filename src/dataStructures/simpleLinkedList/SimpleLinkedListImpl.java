package dataStructures.simpleLinkedList;

import algorithms.searching.SearchingAlgorithms;

public class SimpleLinkedListImpl <T extends Comparable<T>> implements SimpleLinkedList<T>{

	private Node<T> head;
	private int size;
	
	public SimpleLinkedListImpl() {
			this.head = null;
			this.size = 0;
	}
	
	@Override
	public int size() {
		return this.size;
	}

	@Override
	public void insertInTheHead(T data) {
		if(head == null)
		{
			head = new Node<T>(data);
			this.size++;
			return;
		}
		Node<T> node = new Node<T>(data,head);
		head = node;
		this.size++;
	}

	@Override
	public void insertInTheEnd(T data) {
		if(head == null)
		{
			head = new Node<T>(data);
			this.size++;
			return;
		}
		Node<T> tmp = head;
		while(tmp.getNext() != null)
		{
			tmp = tmp.getNext();
		}
		tmp.setNext(new Node<T>(data));
		this.size++;
	}

	@Override
	public void insertInIndex(T data, int index) {
		checkBounds(index);
		if(index == 0)
		{
			Node<T> node = new Node<T>(data,this.head);
			this.head = node;
			this.size++;
			return;
		}
		Node<T> tmp1=head;
		int count = 0;
		while(count < index-1)		
		{
			tmp1 = tmp1.getNext();
			count++;
		}
		Node<T> node = new Node<T>(data,tmp1.getNext());
		tmp1.setNext(node);
		this.size++;
	}

	@Override
	public boolean deleteNodebyValue(T data) {
		if(this.head == null)
			return false;
		if(this.head.getData().compareTo(data) == 0)
		{
			this.head = this.head.getNext();
			this.size--;
			return true;
		}
			
		Node<T> tmp1=head,tmp2=head.getNext();
		while(tmp2 != null)
		{
			if(tmp2.getData().compareTo(data) == 0)
			{
				tmp1.setNext(tmp2.getNext());
				this.size--;
				return true;
			}				
			tmp1 = tmp2;
			tmp2 = tmp2.getNext();
		}
		return false;
	}

	@Override
	public boolean deleteNodeByIndex(int index) {
		checkBounds(index);
		if(head == null)
			return false;
		if(index == 0)
		{
			this.head = this.head.getNext();
			this.size--;
			return true;
		}
		Node<T> tmp1=head;
		int count = 0;
		while(count < index-1)		
		{
			tmp1 = tmp1.getNext();
			count++;
		}
		tmp1.setNext(tmp1.getNext().getNext());
		this.size--;
		return true;
	}

	@Override
	public int searchNodeByValue(T x) {
		if(this.head == null)
			return -1;
		Node<T> tmp = head;
		int count = 0;
		while(tmp != null)
		{
			if(tmp.getData().compareTo(x) == 0)
				return count;
			count++;
			tmp = tmp.getNext();
		}
		return -1;
	}

	@Override
	public boolean isEmpty() {
		return head == null ? true : false;
	}

	@Override
	public void reverse() {
		
		
	}
	
	private void checkBounds(int position)
	{
		if(position< 0 || position>this.size || this.head == null)
			throw new IndexOutOfBoundsException(position+"");
	}

	@Override
	public void displayList() {
		if(this.head == null)
			return;
		Node<T> tmp = this.head;
		while(tmp != null)
		{
			System.out.println(tmp.getData());
			tmp = tmp.getNext();
		}	
	}
	
}
