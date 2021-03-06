## What Is The Chain Of Responsibility Design-Pattern?

* A design pattern that sends data to an object and if that
  object cannot use said data, it may send the date over to 
  any number of other objects that may use it
  
  * For Example:
  * 4 Objects that can either add, substract, multiply, or divide
    Send 2 numbers and a command and allow these 4 objects to decide
    which can handle the requested calculation

![Chain_Of_Responsibility_Design_Pattern_Diagram](res/Chain-Of-Responsibility-Design-Pattern-UML-Diagram.png)

## Implementation
* **Interface**: An interface shared by all objects in the chain
  that allows data to be passed to all objects in
  the chain if the current object cannot operate
  on the data given
  * **Objects**, each with their own seperate responsibilities

* **Data** to be operated on
  