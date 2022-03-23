//Abstract keyword used when don't want others to create objects in the super class. Abstract will prevent this. 
//why need Abstract class? Super classes are extedned ex Integer, Double, Float all extends with NUMBER


abstract class School {
	public String fname = "Skylar";
	public int age = 15;

	public abstract void study();//abstract method only can create these in abstract classes 
	
}

class Student extends School { 

	public int GraduationYear = 2025;
	
	
	public void study() {
		System.out.println("Study all day long");
	}

}

public class AbstractDemo {

	public static void main(String[] args) { //objects can only created from the sub class when the abstract class is extends
		Student myObj = new Student();
	
		System.out.println("Name: " + myObj.fname);
		System.out.println("Age: " + myObj.age);
		System.out.println("Graduation Year: " + myObj.GraduationYear);

		myObj.study();
	}

}
