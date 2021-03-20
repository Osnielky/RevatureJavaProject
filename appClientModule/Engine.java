
public class Engine extends CarPart {

	public boolean running;
	public int numberOfCilinders;
	
	
	/**
	 * @param running
	 * @param numberOfCilinders
	 */
	public Engine(boolean running, int numberOfCilinders,int condition) {
		super(condition);
		this.running = running;
		this.numberOfCilinders = numberOfCilinders;
	}




	@Override
	public void function() {
		// TODO Auto-generated method stub
		System.out.println("Engine Part :" );
		super.function();
		System.out.println(" Show me if it is running :" +running);
		System.out.println(" Show me The number of Cilidners :" +numberOfCilinders);
		
	}
	
	
	
}
