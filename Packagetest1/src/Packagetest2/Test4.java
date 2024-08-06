package Packagetest2;

public class Test4 {
	//(10/2)-2)*2)-2)+2)
	
	public int div (int a, int b)
	{
		int c;
	c = a/b;
	System.out.println("result of div " + c);
	return c;
		
	}
	public int sub (int d, int e)
	{
		int f;
		f = d-e;
		System.out.println("result of sub " + f);
		return f;
	}
public int mul (int g, int h)
{
	int i;
	i = g*h;
	System.out.println("result of mul " + i);
	return i;
		
	}
public int sub1 (int j, int k)
{
	int l;
	l = j-k;
	System.out.println("result of sub " + l);
	return l;
}
public void sum (int m, int n)
{
	int o;
	o = m + n;
	System.out.println("final result " + o);
	
}
public static void main(String[] args) {
	Test4 ob = new Test4();
	int divresult = ob.div(10, 2);
	int subresult = ob.sub(divresult, 2);
	int mulresult = ob.mul(subresult, 2);
	int sub1result = ob.sub(mulresult, 2);
     ob.sum(sub1result, 2);
	
}
}

