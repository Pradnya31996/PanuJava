package ArraysinJava;

public class TwoDiamentionlarray {

	public static void main(String[] args) {
		
		int a[][]=new int [2][3];
		//int a[][]= {{},{}};
		
		a[0][0]=56;
		a[0][1]=34;
		a[0][2]=90;
		a[1][0]=87;
		a[1][1]=65;
		a[1][2]=65;
		System.out.println(a.length);
		System.out.println(a[0].length);
		//reading array
		
		for(int i=0;i<=a.length;i++)
		{
			for(int j=0;j<=a.length;j++)
			{
				System.out.println(a[i][j]);
				
			}
			System.out.println();
		}
		
		//System.out.println(a.length);
	}

}
