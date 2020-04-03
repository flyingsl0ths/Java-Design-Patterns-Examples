## What Is The Abstract Factory Pattern?

* Similar to the Factory Design Pattern, but everything is
  **encapsulated** including the factory used to generate the
  factories

  * The method that orders the object
  * The factories build the object
  * The final objects

## What Can you Do With An Abstract Factory?

* Creation of families of related objects without specifying a concrete class

* Useful when there are many objects that can be added, or changed dynamically during runtime

* Any type of object can be modeled and interacted with through a common interface

* Cons: things can get complicated

* An abstract factory works around a super-factory which creates other factories, this factory is also called a factory of factories.

* In An Abstract Factory Pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects much like the Factory Pattern

## Analogy

* Can be thought of as a **customer placing an order for a certain
  type of product** **to a producer** the producer **has no knowledge
  of how the product will be made**, **all the producer knows is where
  to send the order off to** _so that the will customer recieve his order_

![Abstract_Factory_Design_Pattern_Diagram](res/Abstract-Factory-Pattern-UML-Diagram.jpg)

* Diagram Legend:
  * `+` **public** _instance variable/field/abstract method_


## Implementation:

* **Abstraction**: This will be implemented by all **Factories** who
  will return an object that can take on many forms that being said
  the abstraction allows for the factory to take on many forms as well

* **Abstraction**:  A class shared amongst objects (The objects who
  inherit from this class will be returned by the Concrete Implemetation
  of the Abstract Factory)