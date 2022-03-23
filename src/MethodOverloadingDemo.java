//CTRL + SHIFT + F to format 
class Casio

{
	/// Create a method () Same method name but must have different parameters
	public void add(int i, int j) {
		System.out.println(i + j);
	}

	/// Create a method () // //Create a class constructor for the main class 
	public void add(int i, int j, int k) {
		System.out.println(i + j + k);
	}

	/// Create a method ()
	public void add(double i, double j) {
		System.out.println(i + j);
	}
}

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an Object

		Casio obj = new Casio();
		obj.add(5, 2);
		obj.add(6, 3, 1);
		obj.add(3.5, 7.3);
	}

}
