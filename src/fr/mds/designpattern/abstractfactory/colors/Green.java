package fr.mds.designpattern.abstractfactory.colors;

import fr.mds.designpattern.abstractfactory.globals.Item;

public class Green implements Color, Item {
    public static final String GREEN = "green";

    @Override
    public void fill() {
        System.out.println("This is a green color");
    }

    @Override
    public String getName() {
        return GREEN + " color";
    }
}
