//static means that it can be accessed without creating an object of the class
// public can only be accessed by objects:

public class VaccineStatus {
  static void myMethod() {
    System.out.println("I am Vacinated");
  }
  
  public void getStatus(String status) {
	 System.out.println("I am not Vacinated");
  }

  public static void main(String[] args) {
    myMethod(); // Call the static method
    
    VaccineStatus vs = new VaccineStatus(); // Create an object of Main
    
    vs.getStatus("a"); // Call the public method on the object
  }
}
