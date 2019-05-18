package NewPackage;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] num = {
				{1,2,3} , {4,5,6}, {7,8,9},{10,11,12,13} };
		for (int i= 0;  i <num.length; i++)
		{
			System.out.println();
			for (int j = 0; j <num[i].length; j++)
			{
				System.out.print("\t"+num [i][j]);
			}
		
		}

	}

}
