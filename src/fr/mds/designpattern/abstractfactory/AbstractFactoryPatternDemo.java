package fr.mds.designpattern.abstractfactory;

import fr.mds.designpattern.abstractfactory.colors.Blue;
import fr.mds.designpattern.abstractfactory.colors.Color;
import fr.mds.designpattern.abstractfactory.colors.Green;
import fr.mds.designpattern.abstractfactory.colors.Red;
import fr.mds.designpattern.abstractfactory.factories.AbstractFactory;
import fr.mds.designpattern.abstractfactory.factories.ColorFactory;
import fr.mds.designpattern.abstractfactory.factories.FactoryProducer;
import fr.mds.designpattern.abstractfactory.factories.ShapeFactory;
import fr.mds.designpattern.abstractfactory.items.CombinedItem;
import fr.mds.designpattern.abstractfactory.items.DrawItem;
import fr.mds.designpattern.abstractfactory.items.Item;
import fr.mds.designpattern.abstractfactory.shapes.Circle;
import fr.mds.designpattern.abstractfactory.shapes.Rectangle;
import fr.mds.designpattern.abstractfactory.shapes.Shape;
import fr.mds.designpattern.abstractfactory.shapes.Square;

import java.util.Objects;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        System.out.println("\n## Exercice n°1\n");
        AbstractFactory shapeFactory = FactoryProducer.getFactory(ShapeFactory.SHAPE);
        
        Shape shape1 = shapeFactory != null ? shapeFactory.getShape(Circle.CIRCLE) : null;
        if (shape1 != null) {
            shape1.draw();
        }

        Shape shape2 = shapeFactory != null ? shapeFactory.getShape(Rectangle.RECTANGLE) : null;
        if (shape2 != null) {
            shape2.draw();
        }

        Shape shape3 = shapeFactory != null ? shapeFactory.getShape(Square.SQUARE) : null;
        if (shape3 != null) {
            shape3.draw();
        }

        AbstractFactory colorFactory = FactoryProducer.getFactory(ColorFactory.COLOR);
        
        Color color1 = colorFactory != null ? colorFactory.getColor(Red.RED) : null;
        if (color1 != null) {
            color1.fill();
        }

        Color color2 = colorFactory != null ? colorFactory.getColor(Green.GREEN) : null;
        if (color2 != null) {
            color2.fill();
        }

        Color color3 = colorFactory != null ? colorFactory.getColor(Blue.BLUE) : null;
        if (color3 != null) {
            color3.fill();
        }

        Shape myShape = Objects.requireNonNull(FactoryProducer.getFactory(ShapeFactory.SHAPE)).getShape(Circle.CIRCLE);
        myShape.draw();

        System.out.println("\n## Exercice n°2\n");

        Item item = FactoryProducer.getItem(Blue.BLUE);
        System.out.println("this is a " + item.getName());
        item = FactoryProducer.getItem(Green.GREEN);
        System.out.println("this is a " + item.getName());
        item = FactoryProducer.getItem(Red.RED);
        System.out.println("this is a " + item.getName());
        item = FactoryProducer.getItem(Square.SQUARE);
        System.out.println("this is a " + item.getName());
        item = FactoryProducer.getItem(Rectangle.RECTANGLE);
        System.out.println("this is a " + item.getName());
        item = FactoryProducer.getItem(Circle.CIRCLE);
        System.out.println("this is a " + item.getName());

        System.out.println("\n## Exercice n°3\n");

        CombinedItem cItem1 = new CombinedItem();
        cItem1.setColor(Objects.requireNonNull(colorFactory).getColor(Blue.BLUE));
        cItem1.setShape(Objects.requireNonNull(shapeFactory).getShape(Square.SQUARE));
        CombinedItem cItem2 = new CombinedItem();
        cItem2.setColor(colorFactory.getColor(Red.RED));
        cItem2.setShape(shapeFactory.getShape(Square.SQUARE));
        CombinedItem cItem3 = new CombinedItem();
        cItem3.setColor(colorFactory.getColor(Blue.BLUE));
        cItem3.setShape(shapeFactory.getShape(Circle.CIRCLE));
        CombinedItem cItem4 = new CombinedItem();
        cItem4.setColor(colorFactory.getColor(Green.GREEN));
        cItem4.setShape(shapeFactory.getShape(Rectangle.RECTANGLE));
        DrawItem dItem = new DrawItem();
        dItem.setName("mon dessin");
        dItem.getItems().add(cItem1);
        dItem.getItems().add(cItem2);
        dItem.getItems().add(cItem3);
        dItem.getItems().add(cItem4);
        dItem.print();

    }
}
