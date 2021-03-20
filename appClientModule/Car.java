import java.util.ArrayList;


public class Car {
	
	//CarPart carPart;
	Engine engine;
	FuelTank fuelTank;
	Wheels wheels;
	
	ArrayList<CarPart> list = new ArrayList<CarPart>();
	
	/**
	 * @param carPart
	 * @param engine
	 * @param fuelTank
	 * @param wheels
	 */
	public Car( Engine engine, FuelTank fuelTank, Wheels wheels) {
		super();
		//this.carPart = carPart;
		this.engine = engine;
		this.fuelTank = fuelTank;
		this.wheels = wheels;
		
		
		
		list.add(wheels);
		list.add(fuelTank);
		list.add(engine);
	}



	public void run () {
		
		System.out.println("    Car is Cheking all parts...");
		System.out.println("The cheking process has done, Here is the result :");
		
	for (int i = 0; i < list.size(); i++) {
		list.get(i).function();	
		
		
	}		
		
		
	}

}
