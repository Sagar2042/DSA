public class sumOfNumberDemo
{
	public sumOfNumberDemo(){
		super();
		}
	public int sumn(int n)
	{
	return n*(n+1)/2;
	}
	public int sumItration(int n)
	{
	int total =0;
	int i=1;
		if(n==0)
		{
		return 0;
		}else
		{
		while(i<=n)
		{
		total = total+i;
		i=i+1;
		}
		return total;
		}
		

	}

	public int sumRecursion(int n)
	{
	if(n==0)
		{
		return 0;
		}else
		{
		return sumRecursion(n-1)+n;
		}
	
	}	

	public static void main(String []args)
	{
	sumOfNumberDemo r = new sumOfNumberDemo();
	System.out.println("sum natural = "+r.sumn(5));
	System.out.println("sum recursion= "+r.sumRecursion(5));
	System.out.println("sum iteration= "+r.sumItration(5));

	}

}