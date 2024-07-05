public class MergeSortDemo
{
	public void mergeSort(int A[],int left,int right)
	{
		if(left<right)
		{
		int mid=(left+right)/2;
		mergeSort(A,left,mid);
		mergeSort(A,mid+1,right);
		merge(A,left,mid,right);
		}	
	}
	public void merge(int A[],int left,int mid,int right)
	{
	int i=left;
	int j=mid+1;
	int k=left;
	int B[]=new int[right+1];
	while(i<=mid && j<=right)
		{
		if(A[i]<A[j])
			{
			B[k]=A[i];
			i=i+1;
			k=k+1;
			}
		else
			{
			B[k]=A[j];
			j=j+1;
			k=k+1;
			}
		}
	while(i<=mid)
		{
		B[k]=A[i];
		i=i+1;
		k=k+1;
		}
	while(j<=right)
		{
		B[k]=A[j];
		j=j+1;
		k=k+1;
		}
	for(int x=left;x<=right;x++)
		{
		A[x]=B[x];
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
	MergeSortDemo m = new MergeSortDemo();
	int A[]={3,5,8,9,6,2};
	System.out.println("Original Array ");
	m.display(A,6);
	
	m.mergeSort(A,0,5);
	System.out.println("\nSorted Array");
	m.display(A,6);
		}
}