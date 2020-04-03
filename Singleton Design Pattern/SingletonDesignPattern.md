## What Is The Singleton Pattern?

* A design pattern used for eliminating the option of 
  instantiating more than one object

* This is acheived by using the private access modifier in Java
  to make the class's contructor non-accessible and instead use
  a static method to return the only instance of the object held
  within the class

  ![Singleton_Design_Pattern_Diagram](res/Singleton-Design-Pattern-UML-Diagram.jpg)


## Implementation
* Restrict multiple threads access to the static
  method used to create the single object (see examples)