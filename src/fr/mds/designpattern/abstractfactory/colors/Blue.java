package fr.mds.designpattern.abstractfactory.colors;

import fr.mds.designpattern.abstractfactory.items.Item;

public class Blue implements Color, Item {
    public static final String BLUE = "blue";

    @Override
    public void fill() {
        System.out.println("This is a blue color");
    }

    @Override
    public String getName() {
        return BLUE + " color";
    }
}
