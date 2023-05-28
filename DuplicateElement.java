package Array;

public class DuplicateElement {

	public static void main(String[] args) 
	{
		int arr[] = new int []  {0,  1, 2, 3, 4, 5, 6, 7, 8, 9};
		int n = arr.length;
		boolean flag = false ;
		for(int i = 0 ; i<n;i++)
		{
			 for(int j=i+1;j<n;j++)
			 {
				 if(arr[i] == arr[j])
				 {
					 flag = true ;
					 break;
				 }
			 }
		}
		if(flag)
		{
			System.out.println("contian duplicate elements");
		}
		else
		{
			System.out.println("No duplicate element is there"); 
		}
	}

}
