package fr.mds.designpattern.builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
    MealBuilderOne mb = new MealBuilderOne();
    Meal vegMeal = mb.prepareVegMeal().build();
    System.out.println("Veg Meal");
    vegMeal.showItems();
    System.out.println("Total Cost: " + vegMeal.getCost());

    Meal nonVegMeal = mb.prepareNonVegMeal().build();
    System.out.println("\n\nNon Veg Meal");
    nonVegMeal.showItems();
    System.out.println("Total Cost: " + nonVegMeal.getCost());

    Meal customMeal = mb.prepareNonVegMeal().addItem(new ChickenBurger()).build();
    System.out.println("\n\nCustom Meal");
    customMeal.showItems();
    System.out.println("Total Cost: " + customMeal.getCost());
    }
}
