package JvInheritance;

class A

{
	int a=10;
	
	void display()
	{
		System.out.println("Pradnya");
	}
	void p()
	{
		int sum=a+10;
		
		System.out.println(sum);
	}
}

class B extends A{
	
	void p()
	{
		int sum=a+20;
		System.out.println(sum);
	}
}

public class singleInheritance {

	public static void main(String[] args) {
		
		B b=new B();
		b.p();
		b.display();
	}

}
