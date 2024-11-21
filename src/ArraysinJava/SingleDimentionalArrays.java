package ArraysinJava;

public class SingleDimentionalArrays {

	public static void main(String[] args) {
		
		//declaration of array
		int a[]=new int [5];
		a[0]=9;
		a[1]=8;
		a[2]=6;
		a[3]=5;
		a[4]=90;
		
		//finding a lenght of array
		int sizea=a.length;
		System.out.println(sizea);
		
		//find perticular element of array
		
		System.out.println(a[2]);
		
		
		//read a array element
		
		/*for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]+"\n");
		}
		System.out.println();
			
		*/
		
		for(int x:a)
		{
			System.out.println(x);
			//System.out.println();
		}
		//System.out.println();
		
		

	}

}
