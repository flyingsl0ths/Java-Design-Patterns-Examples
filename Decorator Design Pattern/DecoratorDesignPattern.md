## What Is The Decorator Design Pattern?

* A design patter where an object is 
  **decorated** with many other objects at 
  _runtime_ to produce an object

* A design pattern that allows you to modify an object dynamically

* Used when you want the capabilities of inheritance with
  subclasses, but need the functionality added at runtime

* It is more flexible than inheritance

* Simplifies code, due to adding functionality using many simple
  classes

* Rather than rewrite old code you can extend new code


![Decorator_Design_Pattern_Diagram](res/Decorator-Design-Pattern-UML-Diagram.png)

* Diagram Legend:
  * `+` **public** _instance variable/field/abstract method_


## Implementation
* **Interface**: An interface to be implemented by all objects
  who require extra functionality added to them

* **Abstraction**: An abstract class which all objects containing
  the extra functionality will implement 
  * **This class must accept the target object
  as an argument in it's constructor**