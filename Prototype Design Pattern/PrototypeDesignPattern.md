## What Is The Prototype Design Pattern?

* Used for creating new objects(instances) by cloning(copying)
  other objects

* Allows for adding of any subclass instance of a known superclass
  at runtime

* Used for when there are numerous potential classes that you want
  only used if needed at runtime

* Reduces the need for creating subclasses

* This pattern involves implementing a prototype interface which   
  tells to the object to create a clone of the current object. This pattern is used when creation of an object directly is costly.

![Prototype_Design_Pattern_Diagram](res/Prototype-Pattern-UML-Diagram.jpg)

* Diagram Legend:
  * `+` **public** _instance variable/field/abstract method_

## Implementation

* **Interface**: An interface shared by all copies
  of an object which will be used at runtime

* **Cache**: Acts as container for all implmentations
  of the **Interface** which will be used at runtime,
  this is also a way of retrieving copies of the **Interface**