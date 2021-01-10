package algorithms.searching;

public class SearchingAlgorithms <T extends Comparable<T>>{
	
	
/*	public int linearSearch(T[] array,T element)
	{
		for(int i=0;i<array.length;i++)
		{
			if(array[i].compareTo(element) == 0)
				return i;
		}
		return -1;
	}
	
	public int binarySearch(T[] array,int li,int hi,T element)
	{
		if(hi >= li)
		{
			int mid = li + (hi - li)/2;
			if(array[mid].compareTo(element) == 0)
				return mid;
			if(array[mid].compareTo(element) > 0)
				return binarySearch(array, li, mid-1, element);
			return binarySearch(array, mid+1, hi, element);
		}
		return -1;
	}
	
	public int jumpSearch(T[] array,T element)
	{
		int n = array.length;
		int step = (int) Math.floor(Math.sqrt(n));
		int previous = 0;
		while(array[Math.min(step, n)-1].compareTo(element) < 0)
		{
			previous = step;
			step += (int) Math.floor(Math.sqrt(n));
			if(previous >= n)
				return -1;
		}
		
		while (array[previous].compareTo(element) < 0) {
			previous++;
			if(previous == Math.min(step, n))
				return -1;
		}
		
		if(array[previous].compareTo(element) == 0)
			return previous;
		return -1;
	}
	
	*/
			/*// The idea of formula is to return higher value of pos
		// when element to be searched is closer to arr[hi]. And
		// smaller value when closer to arr[lo]
		pos = lo + [ (x-arr[lo])*(hi-lo) / (arr[hi]-arr[Lo]) ]
		
		arr[] ==> Array where elements need to be searched
		x     ==> Element to be searched
		lo    ==> Starting index in arr*/
	
	
	
	public int linearSearch(T[] array,T x)
	{
		for(int i=0;i<array.length;i++)
		{
			if(array[i].compareTo(x) == 0)
				return i;
		}
		return -1;
	}
	
	public int binarySearch(T[] array,int low,int high,T x)
	{
		if(low < high)
		{
			int middle = low + (high-low)/2;
			if(array[middle].compareTo(x) == 0)
				return middle;
			if(array[middle].compareTo(x) < 0)
				return binarySearch(array, middle+1, high, x);
			return binarySearch(array, low, middle-1, x);
		}
		return -1;
	}
	
	public int interpolationSearch(Integer[] array,int low,int high,int x)
	{
		if(low < high)
		{
			int pos = low + ((high-low)*(x - array[low]))/(array[high]-array[low]);
			if(array[pos] == x)
				return pos;
			if(array[pos] > x)
				return interpolationSearch(array, low, pos-1, x);
			return interpolationSearch(array, pos+1, high, x);
		}
		return -1;
	}
	
	public int jumpSearch(T[] array,T x)
	{
		int step = (int) Math.floor(Math.sqrt(array.length));
		int prev = 0 ;
		
		while(array[Math.min(step, array.length)-1].compareTo(x)<0)
		{
			prev = step;
			step += (int) Math.floor(Math.sqrt(array.length));
			if(prev >= array.length)
				return -1;
		}
		
		while(array[prev].compareTo(x)<0)
		{
			prev++;
			if(prev == Math.min(step, array.length))
				return -1;
		}
		
		if(array[prev].compareTo(x) == 0)
			return prev;
		return -1;
	}
	

}
