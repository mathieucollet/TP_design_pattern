package fr.mds.designpattern.builder;

public abstract class Burger implements Item {
    protected String name;
    protected Packing packing = new Wrapper();
    protected float price;

    @java.lang.Override
    public String name() {
        return this.name;
    }

    @java.lang.Override
    public Packing packing() {
        return this.packing;
    }

    @java.lang.Override
    public float price() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Burger => " + name + ", packing=" + packing + ", price=" + price + '}';
    }
}
