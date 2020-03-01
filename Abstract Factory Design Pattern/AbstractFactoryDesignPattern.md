## What Is The Abstract Factory Pattern?

* Similar to the Factory Design Pattern, but everythin is **encapsulated**

  * The method that orders the object
  * The factories build the object
  * The final objects
  * The final objects contain objects that use the Strategy Pattern
    * Composition: Object class fields are objects

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