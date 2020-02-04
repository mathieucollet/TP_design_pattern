package fr.mds.designpattern.abstractfactory.factories;

import fr.mds.designpattern.abstractfactory.colors.Color;
import fr.mds.designpattern.abstractfactory.shapes.Shape;

public class AbstractFactory {
    public Shape getShape(String shape) {
            return new ShapeFactory().getShape(shape);
    }

    public Color getColor(String color) {
        return new ColorFactory().getColor(color);
    }
}
