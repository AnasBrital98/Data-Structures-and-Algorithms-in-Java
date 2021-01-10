package dataStructures.doublyLinkedList;

public interface DoublyLinkedList <T> {

	void insertInTheHead(T data);
	void insertInTheEnd(T data);
	void insertInIndex(T data,int index);
	int deleteNodebyValue(T x);
	int deleteNodeByIndex(int index);
	int serachNode(T x);
	int replaceNodebyValue(T x);
	int repalceNodeByIndex(int index);
	T getElement(int index);
	void sortList();
	void reverseList();
	boolean isEmpty();
	int size();
}
