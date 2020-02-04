package fr.mds.designpattern.abstractfactory.colors;

import fr.mds.designpattern.abstractfactory.globals.Item;

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
