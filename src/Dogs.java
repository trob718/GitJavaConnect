
public class Dogs {

	// Create a public Class

	String dogBreed;
	String dogColor;
	String dogSize;
	String dogAge;

	// Create a class constructor, methods()for the main class
	public Dogs(String breed, String color, String size, String age) {

		dogBreed = breed;
		dogColor = color;
		dogSize = size;
		dogAge = age;
	}

	// the constructor is called when the object is created
	public static void main(String[] args) {
		Dogs typeDog = new Dogs("Pit Bull", "Black", "medium", "2");
		System.out.println("Breed is:  "+typeDog.dogBreed + " " + "Color is:  "+ typeDog.dogColor + " Size is:  "+ typeDog.dogSize +  " Age is:  " + typeDog.dogAge);
	}

}
