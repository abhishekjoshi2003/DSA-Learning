package Array;

public class MergeTwoSortedArray {

	public int[] merge(int[] arr1, int[] arr2, int n, int m)
	{
		int result[] = new int[m+n];
		int i=0 ;    //To traverse arr1   
		int j=0;	// To travere arr2
		int k=0;	// to traverse or fill result array
		while(i<n && j<m)
		{
			if(arr1[i] < arr2[j])
			{
				result[k] = arr1[i];
				i++;
			}
			else
			{
				result[k] = arr2[j];
				j++;
			}
			k++;
		}
		while(i<n)
		{
			result[k] = arr1[i];
			i++;
			k++;
		}
		while(j<m)
		{
			result[k] = arr2[j];
			j++;
			k++;
		}
		
		return result;
	}
	
	public void printArray(int[] arr){
		int n = arr.length;
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+"   ");
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr1[] = {1,4,8,10,12,15};
		int arr2[] = {2,3,7,16,18,22};
		MergeTwoSortedArray mtsa = new MergeTwoSortedArray();
		mtsa.printArray(arr1);
		System.out.println();
		mtsa.printArray(arr2);
		System.out.println();
		mtsa.printArray(mtsa.merge(arr1, arr2, arr1.length, arr2.length));
	}

}
