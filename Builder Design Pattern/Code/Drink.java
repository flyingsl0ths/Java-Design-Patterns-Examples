public abstract class Drink implements Item
{
    public abstract String name();
    
    public Packaging packing() {
        return new Bottle();
    }
    
    public abstract float price();
}