package fr.mds.designpattern.abstractfactory.factories;

import fr.mds.designpattern.abstractfactory.shapes.Circle;
import fr.mds.designpattern.abstractfactory.shapes.Rectangle;
import fr.mds.designpattern.abstractfactory.shapes.Shape;
import fr.mds.designpattern.abstractfactory.shapes.Square;

public class ShapeFactory extends AbstractFactory {
    public static final String SHAPE = "shape";

    public ShapeFactory() {}

    public Shape getShape(String shape) {
        Shape sha;
        switch (shape) {
            case Circle.CIRCLE:
                sha = new Circle();
                break;
            case Rectangle.RECTANGLE:
                sha = new Rectangle();
                break;
            case Square.SQUARE:
                sha = new Square();
                break;
            default:
                sha = null;
                break;
        }
        return sha;
    }
}
