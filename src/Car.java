
public class Car extends Vehicle {

	public Car(String brand, int kilometers) {
		super(brand, kilometers);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String doStuff() {
		// TODO Auto-generated method stub
		return "I am " + this.getBrand() + " and I go zoom zoom zoom!";
	}

}
