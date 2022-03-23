//Encapsulation -> Binding data with methods..access the variables with methods. Variables should be private

class Students
{
	private int rollno; 
	private String name;
	
	//Getters and Setters 	
		
	public void setRollno(int r) {
		rollno = r;
		System.out.println("Value of rollno changed");//log stuff 
	}
	
	public String getName() {
		return name;
	}

	public int getRollno(){
		return rollno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}


public class EncapsulationDemo {

	public static void main(String[] args) 
	
	{
	 
	Students s1 = new Students();
	s1.setRollno(2);
	s1.setName("Robinski");
	System.out.println(s1.getRollno());
	System.out.println(s1.getName());
		
	}

}
