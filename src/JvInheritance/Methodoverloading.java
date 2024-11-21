package JvInheritance;

class Animal
{
	String color="black";
	void beauty()
	{
		String color="green";
		System.out.println(color);
	}
	
	void size()
	{
		String size="long";
		System.out.println(size);
	}
	
}

class cat extends Animal
{
	void size(String a)
	{
		String size="long";
		System.out.println(size + "\t" + a);
		System.out.println(super.color);
	}
	
}


public class Methodoverloading {

	public static void main(String[] args) {
		
		cat c=new cat();
		
		c.size("round");
		//c.size();
		c.beauty();
	}

}
