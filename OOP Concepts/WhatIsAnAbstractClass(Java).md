## Whats An *Abstract Class*?

* If you want the power of polymorphism without all the work

* Use an `abstract class` or an `interface`
  
  * Abstract classes also contain **abstract methods**
  * However abstract classes **do not contain** abstract fields

* All methods in an abstract class **do not have to be abstract**

  * `static` methods **are valid** within an abstract class

* `protected` fields within an `abstract` class are similar to `private` fields except subclasses can inherit them

* However objects **cannot be created** from an `abstract` class, they can only `extend` from it

`abstract public class Thing`
`public abstract void doSomething()`

