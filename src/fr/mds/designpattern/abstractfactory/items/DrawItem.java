package fr.mds.designpattern.abstractfactory.items;

import fr.mds.designpattern.abstractfactory.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class DrawItem {
    String name;
    List<CombinedItem> items = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public List<CombinedItem> getItems() {
        return items;
    }

    public void print() {
        for (CombinedItem item : items
             ) {
            item.getShape().draw();
            item.getColor().fill();
        };
    }
}
