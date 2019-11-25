
public class Hangar {

	public static void main(String[] args) {
		
		Car myCar = new Car("VW", 7777);
		Boat myBoat = new Boat("Bavaria", 10_000);
		
		System.out.println(myCar.doStuff());
		System.out.println(myBoat.doStuff());

	}

}
