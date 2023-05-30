package Array;

public class MaxAndMin {

	public static void main(String[] args) 
	{
		int arr[] = new int[] {11, 2, 55, 12, 1};
		int min = arr[0];
		int max = arr[0];
		int n  = arr.length ;
		for(int i=0 ; i<n ;i++ )
		{
			if(min>arr[i])
			{
				min = arr[i];
			}
			if(max<arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println("Minimum of all elements in array is "+min);
		System.out.println("Maximum of all elements in array is "+max);
		

	}

}
