public class BinarySearchRecursiveDemo
{
	public BinarySearchRecursiveDemo(){
		super();
	}
	public int binarySearch(int A[], int key,int L,int R)
	{
	if(L>R)
	{
	return -1;
	}
	else
	{
	int m=(L+R)/2;
	if(key==A[m])
	{
	return m;
	}else if(key<A[m])
	{
	return binarySearch(A,key,L,m-1);
	}else if(key>A[m])
	{
	return binarySearch(A, key, m+1,R);
	}

	}
	return -1;
	}

	public static void main(String []args)
	{
	BinarySearchRecursiveDemo b =new BinarySearchRecursiveDemo();
	int A[]={12,13,25,55,67};
	int found=b.binarySearch(A,55,0,A.length-1);
	System.out.println("Result = "+found);
	}
	
}