
public class Wheels extends CarPart {
	
	public int level;
	
	
	
	
	
	
	
	
	
	/**
	 * @param level
	 */
	public Wheels(int level,int condition) {
		super(condition);
		this.level = level;
	}









	public void function() {
		// TODO Auto-generated method stub
		System.out.println("Wheels Parts :" );
		
		super.function();
		
		System.out.println(" The tires level is :" +level);
		
		
	}
	
	
	

}
