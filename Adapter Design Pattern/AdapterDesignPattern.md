## What Is The Adapter Design Pattern?

* A way of using an object as an **adapter** to translate
  **methods(actions)** from another object known as an
  **adaptee** to the **client(target)**

* Allows the use of two incompatible interfaces
 to work together

* Used when the client expects a (target) interface

* The Adapter class allows the use of the available
  interface and the Target interface

* Any classes can work togethor as long as the Adapter
  solves the issue that all classes must implement every method
  defined by the shared interface

![Adapter_Design_Pattern_Diagram](res/Adapter-Design-Pattern-UML-Diagram.png)

## Implementation:
* _An Adaptee_

* _A Target_

* **Interface**: Will be shared amongst objects

* **Adapter**: A Class that will translate methods between the _adaptee_
  and the _target object_ this class will also **contain
  an instance of the adaptee** in order to perform the translation