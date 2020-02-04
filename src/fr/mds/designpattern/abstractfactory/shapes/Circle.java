package fr.mds.designpattern.abstractfactory.shapes;

import fr.mds.designpattern.abstractfactory.globals.Item;

public class Circle implements Shape, Item {
    public static final String CIRCLE = "circle";

    @Override
    public void draw() {
        System.out.println("This is a circle shape");
    }

    @Override
    public String getName() {
        return CIRCLE + " shape";
    }
}
