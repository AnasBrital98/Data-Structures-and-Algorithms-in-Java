package dataStructures.doublyLinkedList;


public class DoublyLinkedListImpl <T extends Comparable<T>> implements DoublyLinkedList<T>{

	private Node<T> head;
	private int size;
	
	public DoublyLinkedListImpl() {
		this.head = null;
		this.size = 0;
	}

	@Override
	public void insertInTheHead(T data) {
		if(head == null)
		{
			head = new Node<T>(data);
			size++;
			return;
		}
		head = new Node<T>(data,head);
		this.size++;		
	}

	@Override
	public void insertInTheEnd(T data) {
		if(head == null)
		{
			head = new Node<T>(data);
			size++;
			return;
		}
		Node<T> tmp = head;
		while(tmp.getNext() != null)
			tmp = tmp.getNext();
		tmp.setNext(new Node<T>(data));
		size++;
	}

	@Override
	public void insertInIndex(T data, int index) {
		checkBounds(index);
		if(index == 0)
		{
			head = new Node<T>(data,head);
			size++;
			return;
		}
		int count = 0;
		Node<T> tmp = head;
		while(count < index-1)
		{
			tmp = tmp.getNext();
			count++;
		}
		Node<T> node = new Node<T>(data,tmp.getNext());
		tmp.setNext(node);
		size++;
	}

	@Override
	public int deleteNodebyValue(T x) {
		if(head == null)
			return -1;
		int count = 0;
		Node<T> tmp = head;
		while(tmp != null)
		{
			if(tmp.getData().compareTo(x) == 0)
			{
				tmp.getPrevious().setNext(tmp.getNext());
				size--;
				return count;
			}
			count++;
			tmp = tmp.getNext();
		}				
		return -1;
	}

	@Override
	public int deleteNodeByIndex(int index) {
		checkBounds(index);
		int count = 0;
		Node<T> tmp = head;
		while(count < index)
		{
			tmp = tmp.getNext();
			count++;
		}
		tmp.getPrevious().setNext(tmp.getNext());
		size--;
		return count;
	}

	@Override
	public int serachNode(T x) {
		if(head == null)
			return -1;
		Node<T> tmp = head;
		int count =0;
		while(tmp != null)
		{
			if(tmp.getData().compareTo(x) == 0)
			{
				return count;
			}
			count++;
			tmp = tmp.getNext();
		}
		return -1;
	}

	@Override
	public int replaceNodebyValue(T x) {
		
		return 0;
	}

	@Override
	public int repalceNodeByIndex(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T getElement(int index) {
		checkBounds(index);
		int count = 0;
		Node<T> tmp = head;
		while(count < index)
		{
			count ++;
			tmp = tmp.getNext();
		}
		return tmp.getData();
	}

	@Override
	public void sortList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reverseList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		return head == null ? true : false;
	}

	@Override
	public int size() {
		return size;
	}
	
	private void  checkBounds(int index)
	{
		if(index < size || index > size || head == null)
			throw new IndexOutOfBoundsException(""+index);
	}

}
