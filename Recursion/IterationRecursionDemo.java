public class IterationRecursionDemo
{
	public IterationRecursionDemo(){
		super();
	}
	public void calculateIterative(int n)
	{
	while(n>0)
		{
		int k = n*n;
		System.out.println(" "+k);
		n=n-1;
		}

	}

public void calculateRecurcive(int n)
	{
	if(n>0)
		{
		int k = n*n;
		System.out.println(" "+k);
		calculateRecurcive(n-1);
		}

	}

public static void main(String []args)
	{
	IterationRecursionDemo r =new IterationRecursionDemo();
	//r.calculateiterative(4);
	r.calculateRecurcive(4);
	}

}