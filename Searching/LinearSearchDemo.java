public class LinearSearchDemo
{
	public LinearSearchDemo(){
		super();
	}
	public int linearSearch(int A[],int n,int key)
	{
		int index=0;
		while(index < n)
		{
		if(A[index]==key)
		{
		return key;
		}else{
		index=index+1;
		
		}
	
		}
	return -1;
	}
	public static void main(String []args)
	{
	LinearSearchDemo l =new LinearSearchDemo();
	int A[]={10,20,30,40,50};
	int found=l.linearSearch(A,5,30);
	System.out.println("Result = "+found);
	}

}