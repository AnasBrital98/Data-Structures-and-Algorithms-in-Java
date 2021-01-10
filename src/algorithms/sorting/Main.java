package algorithms.sorting;

public class Main {
	
	public static void main(String[] args)
	{
		SortingAlgorithms<String> algorithms = new SortingAlgorithms<String>();
		String[] array = new String[] {"m","c","a","b","l"};
		System.out.println("before Sorting the list");
		for(String s : array)
		{
			System.out.println(s);
		}
		
		algorithms.mergeSort(array, 0, 4);
		
		System.out.println("after Sorting the list");
		for(String s : array)
		{
			System.out.println(s);
		}
	}

}
