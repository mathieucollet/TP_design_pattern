package fr.mds.designpattern.abstractfactory.factories;

import fr.mds.designpattern.abstractfactory.colors.Blue;
import fr.mds.designpattern.abstractfactory.colors.Color;
import fr.mds.designpattern.abstractfactory.colors.Green;
import fr.mds.designpattern.abstractfactory.colors.Red;
import fr.mds.designpattern.abstractfactory.globals.Item;
import fr.mds.designpattern.abstractfactory.shapes.Circle;
import fr.mds.designpattern.abstractfactory.shapes.Rectangle;
import fr.mds.designpattern.abstractfactory.shapes.Square;

public class FactoryProducer {
    public FactoryProducer() {}

    public static AbstractFactory getFactory(String factory) {
        AbstractFactory fac;
        switch (factory) {
            case ShapeFactory.SHAPE:
                fac = new ShapeFactory();
                break;
            case ColorFactory.COLOR:
                fac = new ColorFactory();
                break;
            default:
                fac = null;
                break;
        }
        return fac;
    }

    public static Item getItem(String type) {
        Item item;
        switch (type) {
            case Red.RED:
            case Blue.BLUE:
            case Green.GREEN:
                item = (Item) new ColorFactory().getColor(type);
                break;
            case Rectangle.RECTANGLE:
            case Circle.CIRCLE:
            case Square.SQUARE:
                item = (Item) new ShapeFactory().getShape(type);
                break;
            default:
                item = null;
                break;
        }
        return item;
    }
}
