public class BubbleSortDemo
{
	public BubbleSortDemo(){
		super();
	}
	public void bubbleSort(int A[],int n)
	{
	for(int pass=n-1;pass>=0;pass--)
		{
	for(int i=0;i<pass;i++)
		{
		int temp;
		if(A[i]>A[i+1])
		{
		 temp=A[i];
		A[i]=A[i+1];
		A[i+1]=temp;
		}
		}
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
	BubbleSortDemo b=new BubbleSortDemo();
	int A[]={3,2,5,12,9,1};
	System.out.println("Unsorted Array ");
	b.display(A,6);
	b.bubbleSort(A,6);
	System.out.println("Sorted Array");
	b.display(A,6);


	}

}