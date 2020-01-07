package fr.mds.designpattern.builder;

public abstract class ColdDrink implements Item {
    protected String name;
    protected Packing packing = new Bottle();
    protected float price;

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public Packing packing() {
        return this.packing;
    }

    @Override
    public float price() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Cold Drink => " + name + ", packing=" + packing + ", price=" + price + '}';
    }
}
