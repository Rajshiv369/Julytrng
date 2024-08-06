package Packagetest2;

public class Test2 {
	// (10+2)(10-2)
	public int sum (int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("result of sum" + c );	
		return c;
	
	}
	public int sub (int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("result of sub" + z);
		return z;
	}
	public void mul(int s, int r) {
	int t;
	t=s*r;
	System.out.println("final result" + t);}
	
	public static void main(String[] args) {
		
		Test2 ob = new Test2();
		int sumresult = ob.sum(10,2);
		int subresult = ob.sub(10,2);
		ob.mul(sumresult, subresult);
		
	}
	
	
}
