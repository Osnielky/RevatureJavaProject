
public class FuelTank extends CarPart {
	
	public int fuelLevel;
	

	
	
	
	
	
	
	
	
	/**
	 * @param fuelLevel
	 */
	public FuelTank(int fuelLevel,int condition) {
		super(condition);
		this.fuelLevel = fuelLevel;
	}










	@Override
	public void function() {
		// TODO Auto-generated method stub
		System.out.println("FuelTank Part :" );
		
		super.function();
		
		System.out.println(" The  fuel Level is  :" +fuelLevel);
		
		
	}
	
	
	
	
	
}
