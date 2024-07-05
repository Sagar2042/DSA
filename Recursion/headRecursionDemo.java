class NumberCalculate{
	public NumberCalculate(){
		super();
	}
	public void calculate(int n)
	{
	if(n>0)
		{
		calculate(n-1);
		int k=n*n;
		System.out.println(k);
		}
	}
}
public class headRecursionDemo
{
	public headRecursionDemo(){
		super();
	}
	public static void main(String []args)
	{

	NumberCalculate r =new NumberCalculate();
	r.calculate(4);

	}
}
