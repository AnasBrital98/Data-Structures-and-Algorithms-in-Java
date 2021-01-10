package dataStructures.simpleLinkedList;

public interface SimpleLinkedList <T>{
	void insertInTheHead(T data);
	void insertInTheEnd(T data);
	void insertInIndex(T data,int index);
	boolean deleteNodebyValue(T data);
	boolean deleteNodeByIndex(int index);
	void displayList();
	int searchNodeByValue(T x);
	int size();
	boolean isEmpty();
	void reverse();
}
