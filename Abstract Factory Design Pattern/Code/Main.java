public class Main 
{
    public static void main(String[] args) {
       // Super Factory which produces Shape Objects
       AbstractFactory shapeFactory = ShapeProducer.getFactory(false);

       // Produce a Rectangle Object that is a Shape
       Shape shape1 = shapeFactory.getShape("Rectangle");

       // Call a method inherited from the Shape Object
       shape1.draw();

       // Produce a Square Object that is a Shape
       Shape shape2 = shapeFactory.getShape("Square");

       // Call a method inherited from the Shape Object
       shape2.draw();
       System.out.println();

       // Super Factory which produces RoundedShape Objects
       AbstractFactory roundedShapeFactory = ShapeProducer.getFactory(true);

       // Produce a RoundedRectangle Object that is a Shape
       Shape shape3 = roundedShapeFactory.getShape("Rectangle");

       // Call a method inherited from the Shape Object
       shape3.draw();

       Shape shape4 = roundedShapeFactory.getShape("Square");

       // Call a method inherited from the Shape Object
       shape4.draw();
       System.out.println();
    }
 }