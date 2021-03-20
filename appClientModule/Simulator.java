
public class Simulator {
	
	
	
	public static void main(String[] args) {
// Test Data
		Engine engine = new Engine(true,4,90);
		FuelTank fuePart = new FuelTank(50,100);
		Wheels wheels = new Wheels(20,100);

		
		
		Car car = new Car(engine, fuePart, wheels);
		car.run();
		
		
		
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Simulator() {
		super();
	}

}