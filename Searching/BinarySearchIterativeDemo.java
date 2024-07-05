public class BinarySearchIterativeDemo
{
	public BinarySearchIterativeDemo(){
		super();
	}

	public int binaryIterative(int A[],int n,int key)
	{
	int L=0;
	int R=n-1;
	while(L<=R)
		{
		int m=(L+R)/2;
		if(key==A[m])
		{
		return m;
		}else if(key<A[m])
		{
		R=m-1;
		}else if(key>A[m])
		{
		L=m+1;
		}
	
		}
	return -1;
	}
	
	public static void main(String []args)
	{
	BinarySearchIterativeDemo b=new BinarySearchIterativeDemo();
	int A[]={15,21,47,84,96}; 
	int found =b.binaryIterative(A,5,84);
	System.out.println("Result = "+found);
	}

}