
public abstract class Vehicle {

//	1. Create an abstract class Vehicle.
//	2. Add the attributes String brand and int kilometers.
//	3. Create a constructor to initialise brand and kilometers 
//	4. Add getters and setters for all attributes, while also respecting the syntax conventions
//	5. Create a Car class that extends the Vehicle class
//	6. Create a Boat class that also extends the Vehicle class
//	7. Inside Vehicle add the abstract method public String doStuff()
//	8. Inside Car and Boat add an implementation of the body of the method doStuff(). 
//		For Car, you will need to refer back to:  "I am {brand} and I go zoom zoom zoom!" and 
//		for Boat: "I am {brand} and I go glug glug!"
//	9. Create a Hangar class that will have a main() method
//	10. Add references to instances of the Car and Boat classes in the main() method of Hangar
//	11. For each of the references, display the result of calling the doStuff() method in the terminal
//	12. Compile and test Hangar: once everything is working, create a git repository and add it all to GitHub
//	13. Submit a link to your GitHub repository as the solution
	
	private String brand;
	private int kilometers;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getKilometers() {
		return kilometers;
	}

	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}

	public Vehicle(String brand, int kilometers) {
		this.brand = new String (brand);
		this.kilometers = kilometers;
	}
	
	public abstract String doStuff();
}
