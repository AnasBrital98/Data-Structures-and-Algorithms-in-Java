package algorithms.sorting;

public class SortingAlgorithms <T extends Comparable<T>>{
			
	public void selectionSort(T[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			int minimumIndex = i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j].compareTo(array[minimumIndex]) < 0)
					minimumIndex = j;
			}
			T temp = array[i];
			array[i] = array[minimumIndex];
			array[minimumIndex] = temp;
		}
	}
	
	public void insertionSort(T[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			T key = array[i];
			int j = i-1;
			while(j>=0 && array[j].compareTo(key) > 0)
			{
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
		}
	}
	
	public void bubbleSort(T[] array)
	{
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length-i-1;j++)
			{
				if(array[j].compareTo(array[j+1]) > 0)
				{
					T temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	private int partition(T[] array,int low,int hight)
	{
		T pivot = array[hight];
		int i = low - 1;
		for(int j=0;j<hight;j++)
		{
			if(array[j].compareTo(pivot) < 0)
			{
				i++;
				T temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		T temp = array[i+1];
		array[i+1] = array[hight];
		array[hight] = temp;
		return i+1;
	}
	
	public void quickSort(T[] array,int low,int hight)
	{
		if(low < hight)
		{
			int pivotIndex = partition(array, low, hight);
			quickSort(array, low, pivotIndex-1);
			quickSort(array, pivotIndex+1, hight);
		}
	}
	
	private void merge(T[] array,int low,int middle,int hight)
	{
		int n1 = middle - low + 1;
		int n2 = hight - middle;
		
		T[] subarray1 = (T[]) new Comparable[n1];
		T[] subarray2 = (T[]) new Comparable[n2];
		
		for(int i=0;i<n1;i++)
			subarray1[i] = array[low + i];
		for(int j=0;j<n2;j++)
			subarray2[j] = array[middle+1+j];
		
		int i=0,j=0,k=low;
		while(i<n1 && j<n2)
		{
			if(subarray1[i].compareTo(subarray2[j])<0)
			{
				array[k] = subarray1[i];
				i++;
			}else {
				array[k] = subarray2[j];
				j++;
			}
			k++;
		}
		
		while(i < n1)
		{
			array[k] = subarray1[i];
			i++;k++;
		}
		
		while(j < n2)
		{
			array[k] = subarray2[j];
			j++;k++;
		}
	}
	
	public void mergeSort(T[] array,int low,int hight)
	{
		if(low < hight)
		{
			int middle = (low+hight)/2;
			mergeSort(array, low, middle);
			mergeSort(array, middle+1, hight);
			merge(array, low, middle, hight);
		}
	}
		
}
