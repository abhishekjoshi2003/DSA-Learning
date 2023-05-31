package Array;

public class MaxSumOfSubarray {
	public static int maxSubarraySum(int a[], int n)
	{
		int max = a[0];
		int sum = a[0];
		for(int i=1;i<n;i++)
		{
			sum +=a[i];
			if(sum < a[i])
			{
				sum = a[i];
			}
			if(max<sum)
			{
				max = sum ;
			}
		}
		return max;
	}
	public static void main(String[] args) 
	{
		int a[] = new int[] {1, -2, 3, 2, 5};
		int n = a.length;
		int sum = maxSubarraySum(a, n);
		System.out.println("Maximum sum of an subarray in an array is "+sum);
		
	}

}
