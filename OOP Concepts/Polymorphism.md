## What is **Polymorphism**?

* _Polymorphism_ allows the programmer to write **methods that don't need to change if new subclasses are created**

* For example Dog can add a new method _without changing anythin within it's superclass_ Animal

* if Dog wants to override a method, it can do so without affecting Animal

* Objects **(In Java)** can be stored within an array of objects as such: `Cat[]`

* SubClasses **(In Java)** can be referred to by their superclass type when initializing a subclass object as such `Animal kitty = new Cat();`

  * However accessing methods that do not exist within the superclass is not possible this way

`public class Animal {`
    
    // Super Class
    private String name;
    private int weight;
    private String sound;
    
    public void setName(String newName) { this.name = newName; }

    public String getName() { return this.name; }

    public void setWeight(int newWeight) { 
        if(newWeight > 0) {
            this.weight = newWeight;
        } else {
            System.out.println("Weight must be greater than 0");
        }
    }

    public int getWeight() { return this.weight; }

    public String getSound() { return this.sound; }

    public void setSound(String newSound) { this.sound = newSound; }

    public void eat() { System.out.println("is eating"); }
    
`}`

`public class Dog extends Animal {`
    
    // SubClass
    public Dog() {
        super();

        setSound("Bark");
    }

    /* New method added without changing 
     * the contents of Animal 
     */
    public void digHole() {
        System.out.println("Dug a hole");
    }

    /* Dog overwrote the method eat() to take accept
     * a string as a parameter 
     */
    public void eat(String food) {
        System.out.println(this.name + " is eating " + food);
    }
`}`



