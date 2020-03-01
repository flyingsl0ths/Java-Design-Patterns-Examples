public class RoundedShapeFactory extends AbstractFactory {
    public Shape getShape(String shapeType) {
        shapeType = shapeType.toLowerCase();
        Shape newShape = null;

        switch(shapeType) {
           case "square": newShape = new RoundedSquare();
           break;
           case "rectangle": newShape = new RoundedRectangle();
           break;
        }
        
        return newShape;
    }
 }