import java.util.Scanner;
public class ArrayOperations
{
	public static void main(String []args)
	{
	
	Scanner sc = new Scanner(System.in);
	int m ;
	System.out.println("Enter number of index in Array ");
	int n=sc.nextInt();
	int arr1[]=new int[n];
	int arr2[] = new int[n+1];
	
	System.out.println("Enter new value to be inserted ");
		for(int i=0 ; i < n ; i ++)
		{
		arr1[i]=sc.nextInt();
		}
	System.out.println(" value are ");
		for(int i=0 ; i < n ; i ++)
		{
		System.out.println(arr1[i]);
		}

	System.out.println("Enter index for new vlaue");
		
		m = sc.nextInt();
		
	System.out.println("Enter number for fill index number "+m);
		int number = sc.nextInt();
	
		for(int i = 0 ; i< n+1 ; i++)
		{
		 if(i<m)
		{
		arr2[i]=arr1[i];
		 }else if(i==m)
			{
			arr2[i]=number;
			}else
				{
				arr2[i]=arr1[i-1];
				}
		}
	
	System.out.println("Value are : ");
		for(int i=0 ; i < n+1 ; i ++)
		{
		System.out.println(arr2[i]);
		}

	}

}