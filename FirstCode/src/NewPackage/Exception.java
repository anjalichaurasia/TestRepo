package NewPackage;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		/*int n1 =5;
		int n2 =0;
		System.out.println("Invalid number"+n1/n2 );*/
			String[]name = {"AB","CD"};
			System.out.println(name [4]);
		}
		catch (ArithmeticException name) {
			// TODO: handle exception
		 System.out.println("Not Appl");
		}
		catch (NullPointerException name)
		{
		System.out.println("Invalid");
		}
		catch (ArrayIndexOutOfBoundsException name) {
			System.out.println("Appl");
			// TODO: handle exception
		}
		
finally {
	System.out.println("Error");
}
	}

}
