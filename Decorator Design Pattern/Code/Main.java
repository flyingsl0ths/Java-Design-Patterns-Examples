public class Main
{
    public static void main(String[] args) {
        // The PlainPizza object is sent to the Mozzarella constructor
		// and then to the TomatoSauce constructor
		
	    Pizza basicPizza = new TomatoSauce(new Mozzarella(new Pepperoni(new PlainPizza())));
		
		System.out.println("\nIngredients: " + basicPizza.getDescription() + "\n");
		
		System.out.println("\nPrice: " + basicPizza.getCost());
    }
}