## What Is The Flyweight Design Pattern ?

* A design pattern used when a large number of similar
  objects must be created

* To reduce memory usage, objects that are similar in
  some way are shared rather than creating new ones

* When using this pattern the terms "Intrinsic" & "Extrinsic"
  state are thrown around alot
  * Can be thought of as **One-To-Many** or **Many-To-One**
  * Performance loss will revolve around Extrinsic state
  * While Performance gained will revovle around the Intrinsic state