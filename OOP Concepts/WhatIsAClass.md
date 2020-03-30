# __What Is A Class?__

* A class is a blueprint for creating an object

## A class has __*fields*__:

* Known as _Instance Variables_
  * These are what an object knows

* _Methods (Functions)_
  * These are what an object can do

## What is __Inheritance__?

* What do classes have in _common_?

* **Abstract** out those features into a super class

* **Override** or **extend** _methods_ that _don't/do_ work

* Inheritance allows objects to **"inherit"** instance variables from the super class/parent object

* Instance variables/fields are typically only accessible to that one object in **Java** this can be achieved via the **`private`** access modifier as such:

* __Fields__ and __Methods__ _*are already defined when you inherit from the super class*_

* **You only define the changes**

`class Animal {`    
       
       private String name;
       private double weight;
       private int weight;

       public void setName(String name) {
           this.name = newName;
       }
`}`

`class Dog extends Animal {`

    public void digHole() {
        System.out.println("Hole dug");
    }
`}`


## What is `main(String[] args)` for?

* `main()` _creates the objects and helps them to interact with each other it is where the program starts_:

`public static void main(String[] args) {`
    
    Dog grover = new Dog();

    grover.setName("Grover");

    // Don't do this:
    grover.name = "Grover";

`}`

### Why this is not allowed `grover.name = "Grover";` because **ENCAPSULATION**:


## What is __Encapsulation__?

* Allows the super class/parent object to protect all of it's data/fields

## __Parameters__ vs __Arguments__

* __Parameters__ are data types which a function will accept as arguments

* __Arguments__ are data types a function will accept as parameters


## How to protect the object's data?

* _Fields(instance variables) are private_

* __Getter/Setter__ Methods are public

* _Getter = Accessors_

* _Setter = Mutators_

* The super class/parent objects fields **should always be accessible via set/get functions** which set/get fields within an object

`setWeight(int newWeight) {`
    
    if(newWeight > 0) {
        weight = newWeight;
    } else {
        // do something
    }
`}`

`getWeight(int newWeight) {`
    
    return weight;
`}`

## Instance vs Local Variables

* _Fields(instance variables) are declared in the class_

* _Local Variables are declared in a method_

`class Dog {`

    // Field
    private int weight;

    public double getGrams() {
        // Local Variable
        double gramMult = 453.59;

        return gramMult * weight;
    }
`}`

## __*Is A?*__ vs __*Has A?*__

* **Is A?** helps decide if a class should **extend/inherit** from another

  * **Is a** _"Dog" an "Animal"?_
  * **Is a** _"Dog" a "Cat"?_

* **Has a?** helps decide if a class should have a specific **field**
  * _"Dog" has a "Height"_


## When To Use **Inheritance**

* The **subclass** _is a_ **superclass** _"Dog is an Animal"_

* When a **subclass** needs most of the **methods** in a **superclass**

* **Don't use inheritance just to resuse code!**, or when an **"Is A"** relationship isn't present

## Why Use **Inheritance**?

* _Helps avoid duplicate code_

* Changes to the `superclass code` is _instantly reflected_ in `subclasses`

* User knows that all **subclasses** have all of the **methods** of the **superclass**
