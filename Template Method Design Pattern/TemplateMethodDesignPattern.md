## What Is The Template Method Design Pattern?

* A design pattern used to create a group of subclasses that have to
  execute a similar group of methods

* An abstract class is created that contains a method called the
  **Template** method

* The subclasses can override some of the methods calls

![Template_Method_Design_Pattern_Diagram](res/Template-Method-Design-Pattern-UML-Diagram.jpg)

* Diagram Legend:
  * `+` **public** _instance variable/field/abstract method_

## Implementation
* **Algorithm**: Implmented by the subclass each in a slightly
  different way

* **Abstraction**: Sets the **Algorithm** to be implemented
  by the subclasses (this is `final`) while the methods used to
  implement the algorithm can be altered 