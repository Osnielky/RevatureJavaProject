
public class CarPart implements Functional {
	
	int condition;
	
	
	
	
	
	
	
	/**
	 * @param condition
	 */
	public CarPart(int condition) {
		super();
		this.condition = condition;
	}




	public void Status  () {
		
		System.out.println(" The actual condition for this part is :" +condition +status());
	}

public String status () {
	
	if (getCondition()>90)
		return " (Exellent)";
	else if (getCondition()>70) {
		return " (Good)";
		
	}
	else if (getCondition()>40)
	   return " (Regular)";
	
	else 
		return " (Bad)";
	
}






	public int getCondition() {
	return condition;
}




public void setCondition(int condition) {
	this.condition = condition;
}




	@Override
	public void function() {
		// TODO Auto-generated method stub
		Status();
		//System.out.print("The actual condition for this part is :" +condition);
		
		
	}
	
	

}
