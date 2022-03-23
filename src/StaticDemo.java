class Employee {
	int eid;
	int salary;
	static String ceo; //static variable same for all the objects 

	/// Create a method () Constructor...these are created when you load a class
	public void show() {

		System.out.println(eid + " : " + salary + " : " + ceo);

	}

	static { //static block is executed first 
		ceo = "Frank";

	}
public Employee()
	{
		eid = 1;
		salary = 6000;
	}
}

public class StaticDemo {

	// Create the object. the constructor is called when the object is created

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee Terrance = new Employee();
	

		Employee Willie = new Employee();

		Terrance.show();
		Willie.show();

	}

}
