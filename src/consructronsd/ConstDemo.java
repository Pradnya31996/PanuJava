package consructronsd;

public class ConstDemo {
	int length;
	int width;
	
	ConstDemo(int x, int y)
	{
	   int lenght = x;
	    int width=y;
	}
	
	int print()
	{
		return (length*width);
	}
	

	public static void main(String[] args)
	{
		ConstDemo cd=new ConstDemo(12,23);
		int v1=cd.print();
		System.out.println(v1);
		
		
		
		

	}

}
