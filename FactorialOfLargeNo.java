package Array;

public class FactorialOfLargeNo {
	public static void maxElement(int arr[],int n)
	{
		int max = arr[0];
		for(int i=0 ; i<n ;i++ )
		{
			if(max<arr[i])
			{
				max = arr[i];
			}
		}
		factorial(max);
	}
	public static void factorial(int f)
	{
		int fac = 1;
		for(int i=1 ; i<=f;i++)
		{
			fac *= i ;
		}
		System.out.println("Factorial of largest number in array is "+fac);
	}
	public static void main(String[] args) 
	{
		int arr[] = new int[] {1, 2, 3, 4, 5, 6};
		int n = arr.length;
		maxElement(arr, n);

	}

}
