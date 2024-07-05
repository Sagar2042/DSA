import java.util.Scanner;
public class DeleteNumArray
{
	public static void main (String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of array ");

	int n = sc.nextInt();
	int arr1[]=new int[n];
	int arr2[]=new int[n-1];

	System.out.println("Enter value ");
	for(int i=0; i< n ; i++)
	{
	arr1[i]=sc.nextInt();
	}

	System.out.println("value are : ");
	for(int i=0; i< n ; i++)
	{
	System.out.println(arr1[i]);
	}
	System.out.println("Enter index number for deleting number ");
	int m = sc.nextInt();

	for(int i=0; i<arr1.length; i++)
	{
		if(i<m)
		{
		arr2[i]=arr1[i];
		}else
		{
		arr2[i-1]=arr1[i];
		}
	}
	System.out.println("Value are after deleted");
	for(int i=0; i<arr2.length; i++)
	{
	System.out.println(arr2[i]);
	}
    }
}