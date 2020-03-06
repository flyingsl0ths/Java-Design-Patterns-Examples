public class Pepperoni extends ToppingDecorator {

	public Pepperoni(Pizza newPizza) {
		
		super(newPizza);
		
		System.out.println("Adding Pepperoni");
	}
	
	// Returns the result of calling getDescription() for
	// PlainPizza and adds " mozzarella" to it
	
	public String getDescription(){
		
		return tempPizza.getDescription() + ", pepperoni";
		
	}
	
	public double getCost(){
		
		System.out.println("Cost of Pepperoni: " + .75);
		
		return tempPizza.getCost() + .75;
		
	}
	
}