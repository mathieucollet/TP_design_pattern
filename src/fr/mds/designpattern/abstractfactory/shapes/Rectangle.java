package fr.mds.designpattern.abstractfactory.shapes;

import fr.mds.designpattern.abstractfactory.globals.Item;

public class Rectangle implements Shape, Item {
    public static final String RECTANGLE = "rectangle";

    @Override
    public void draw() {
        System.out.println("This is a rectangle shape");
    }

    @Override
    public String getName() {
        return RECTANGLE + " shape";
    }
}
