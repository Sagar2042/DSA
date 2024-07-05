public class factorialDemo
{
	public factorialDemo(){
		super();
	}
	public int factorialn(int n)
	{
	//int fac=1;
	if(n==0)
		{
		return 1;
		}else
		{
		return factorialn(n-1)*n;
		}
	
	}
	public int factorialItetarive(int n)
	{
	int fac=1;
	for(int i=1; i<=n; i++)
		{
		fac = fac*i;
		}
	return fac;
	}
	public static void main(String []args)
	{
	factorialDemo f = new factorialDemo();
	System.out.println("Factorial = "+f.factorialn(4));
	System.out.println("Factorial = "+f.factorialItetarive(4));

	}

}