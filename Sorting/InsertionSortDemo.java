public class InsertionSortDemo
{
	public void insertionSort(int A[],int n)
	{
	for(int i=1;i<n;i++)
		{
		int temp=A[i];
		int position=i;
		while(position>0 && (A[position-1]>temp))
			{
			A[position]=A[position-1];
			position=position-1;
			}
		A[position]=temp;
		}
	}
	public void display(int A[],int n)
	{
	InsertionSortDemo s=new InsertionSortDemo();
	for(int i=0;i<n;i++)
		{
		System.out.print(A[i]+" ");
		}
	System.out.println();

	s.insertionSort(A,6);

	}
	public static void main(String []args)
	{
	InsertionSortDemo i=new InsertionSortDemo();
	int A[]={3,2,5,4,2,1};
	System.out.println("Original Array ");
	i.display(A,6);
	System.out.println("Sorted Array ");
	i.display(A,6);
	
	}
}