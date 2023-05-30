package Array;
import java.util.Scanner;
import java.util.Arrays;

public class KthMaxMin {
	public static void printArray(int arr[], int size)
	{
		for(int i=0; i< size ; i++)
		{
			System.out.print(arr[i]+"   ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int arr[] = new int[] {3, 5, 7, 1, 9, 0} ;
		int n = arr.length ;
		printArray(arr, n);
		Arrays.sort(arr);
		printArray(arr,n);
		System.out.println("Enter k ");
		int k = sc.nextInt();
		System.out.println("K th max is  "+arr[n-(k+1)]);
		System.out.println("K th min is "+arr[k-1]);
	}

}
