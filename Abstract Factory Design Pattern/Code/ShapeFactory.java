public class ShapeFactory extends AbstractFactory {
    public Shape getShape(String shapeType) {
        shapeType = shapeType.toLowerCase();
        Shape newShape = null;

        switch(shapeType) {
           case "square": newShape = new Square();
           break;
           case "rectangle": newShape = new Rectangle();
           break;
        }

        return newShape;
    }
 }