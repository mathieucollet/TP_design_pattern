package fr.mds.designpattern.abstractfactory.shapes;

import fr.mds.designpattern.abstractfactory.globals.Item;

public class Square implements Shape, Item {
    public static final String SQUARE = "square";

    @Override
    public void draw() {
        System.out.println("This is a square shape");
    }

    @Override
    public String getName() {
        return SQUARE + " shape";
    }
}
