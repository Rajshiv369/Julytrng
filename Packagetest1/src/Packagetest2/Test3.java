package Packagetest2;

public class Test3 {
	// (((10+2)+2)*2)/2)
	
	public int sum (int a, int b)
	{
		int c;
		c = a+b;
		System.out.println("result of sum "+ c);
		return c;
}
	public int sum1 (int c, int d)
	{
		int e;
		e = c+d;
		System.out.println("result of sum " + e);
		return e;
	}
  public int mul (int f, int g)
  {
	  int h;
	  h = f*g;
	  System.out.println("result of mul " + h);
	  return h;
  }
  public void div (int i, int j)
  {
	  int k;
	  k = i/j;
	  System.out.println("final result " + k);
	  
	 
  }
  public static void main(String[] args) {
	Test3 ob = new Test3();
	int sumresult = ob.sum(10, 2);
	int sum1result = ob.sum(sumresult,  2);
	int mulresult = ob.mul(sum1result, 2);
	ob.div(mulresult,  2);
	
}
}
