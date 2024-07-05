public class ShellSortDemo
{
	public void shellSort(int []A,int n)
	{
	for(int gap=n/2;gap>0;gap=gap/2 )
		{
		for(int i=gap;i<n;i++)
			{
			int gvalue=A[i];
			int j=i-gap;
			while(j>=0 && (A[j]>gvalue))
			{
			A[j+gap]=A[j];
			j=j-gap;
			A[j+gap]=gvalue;

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
	ShellSortDemo s=new ShellSortDemo();
	int A[]={4,2,6,8,1,9};
	System.out.println("unsorted array ");
	s.display(A,6);
	s.shellSort(A,6);
	System.out.println("Sorted Array");
	s.display(A,6);
	}

}