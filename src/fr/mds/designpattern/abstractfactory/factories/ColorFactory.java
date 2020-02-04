package fr.mds.designpattern.abstractfactory.factories;

import fr.mds.designpattern.abstractfactory.colors.Blue;
import fr.mds.designpattern.abstractfactory.colors.Color;
import fr.mds.designpattern.abstractfactory.colors.Green;
import fr.mds.designpattern.abstractfactory.colors.Red;

public class ColorFactory extends AbstractFactory {
    public static final String COLOR = "color";

    public ColorFactory() {}

    public Color getColor(String color) {
        Color col;
        switch (color) {
            case Red.RED:
                col = new Red();
                break;
            case Blue.BLUE:
                col = new Blue();
                break;
            case Green.GREEN:
                col = new Green();
                break;
            default:
                col = null;
                break;
        }
        return col;
    }
}
