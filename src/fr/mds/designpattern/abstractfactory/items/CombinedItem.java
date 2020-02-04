package fr.mds.designpattern.abstractfactory.items;

import fr.mds.designpattern.abstractfactory.colors.Color;
import fr.mds.designpattern.abstractfactory.shapes.Shape;

public class CombinedItem {
    Shape shape;
    Color color;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shape getShape() {
        return shape;
    }

    public Color getColor() {
        return color;
    }
}
