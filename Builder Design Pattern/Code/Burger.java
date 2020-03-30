public abstract class Burger implements Item
{

    public Packaging packing() {
        return new Wrapper();
    }
    
    public abstract float price();
}