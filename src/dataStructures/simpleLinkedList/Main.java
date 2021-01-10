package dataStructures.simpleLinkedList;

public class Main {

	public static void main(String[] args) {
		SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedListImpl<Integer>();
		
		simpleLinkedList.insertInTheEnd(1);
		simpleLinkedList.insertInTheEnd(2);
		simpleLinkedList.insertInTheEnd(3);
		simpleLinkedList.insertInTheEnd(4);
		simpleLinkedList.insertInTheEnd(5);
		
		simpleLinkedList.deleteNodeByIndex(2);
		
		simpleLinkedList.displayList();
		
		System.out.println("Size  :   "+simpleLinkedList.size());
		
		

	}

}
