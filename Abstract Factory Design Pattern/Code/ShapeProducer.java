public class ShapeProducer 
{
   public static AbstractFactory getFactory(boolean rounded) {   
      if(rounded) {
         System.out.println("Set to make rounded shapes");
         return new RoundedShapeFactory();         
      } else {
         System.out.println("Set to make regular shapes");
         return new ShapeFactory();
      }
   }
 }