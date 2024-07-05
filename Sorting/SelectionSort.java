public class SelectionSort
{
	public void selection(int A[],int n)
	{
	for(int i=0;i<n-1;i++)
	{
		int position = i;
		for(int j=i+1;j<n;j++)
		{
		if(A[j]<A[position])
		{
		position=j;
		}
		}
	
	int temp=A[i];
	A[i]=A[position];
	A[position]=temp;
	
	}

	}
	public void display(int A[],int n)
	{
	for(int i=0;i<n;i++)
		{
		System.out.print(A[i]+" ");
		}
	System.out.println();
	}
	public static void main(String []args)
	{
	SelectionSort s =new SelectionSort();
	int A[]={3,2,4,1,9};
	System.out.println("Original Array ");
	s.display(A,5);
	s.selection(A,5);
	System.out.println("Sorted Array ");
	s.display(A,5);
	}

}