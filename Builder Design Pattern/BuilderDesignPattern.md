## What Is The Builder Pattern?

* _The Factory Pattern but instead of producing an object
  that can take on the form of many objects we produce an object made up of many objects_

* A design pattern used to create objects made from a 
  collection of other objects
  * Used to build an object made up of parts from other objects
  * Used to make the creation of these parts independent of
    the main object
  * Used to hide the creation of the part from the client so both
    aren't dependent
  * The builder knows the specifics and nobody else

![Builder_Design_Pattern_Diagram](res/Builder-Design-Pattern-UML-Diagram.png)

## Implementation
* **Factory**: A class to produce the objects

* **Builder**: A Class which contains a **list of all the objects needed
  to build the final object**

* **Interfaces**: Additional interfaces needed to generalize
 the objects themselves into one single thing