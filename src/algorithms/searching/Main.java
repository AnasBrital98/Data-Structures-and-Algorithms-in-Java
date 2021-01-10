package algorithms.searching;
import algorithms.sorting.SortingAlgorithms;

public class Main {
	
	public static void main(String[] args)
	{
		SearchingAlgorithms<Integer> algorithms = new SearchingAlgorithms<Integer>();
		Integer[] array = new Integer[] {5,10,4,7,8,6,12,7,9,1};
		
		SortingAlgorithms<Integer> sortingAlgorithms = new SortingAlgorithms<Integer>();
		
		sortingAlgorithms.bubbleSort(array);
		
		
		
		if(algorithms.interpolationSearch(array, 0, array.length-1, 4) != -1)
		{
			System.out.println("the wanted element present in the list");
		}
		
		System.out.println("END");
	}

}
