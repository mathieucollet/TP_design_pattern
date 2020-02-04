package fr.mds.designpattern.abstractfactory.colors;

import fr.mds.designpattern.abstractfactory.items.Item;

public class Red implements Color, Item {
    public static final String RED = "red";

    @Override
    public void fill() {
        System.out.println("This is a red color");
    }

    @Override
    public String getName() {
        return RED + " color";
    }
}
