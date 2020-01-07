package fr.mds.designpattern.builder;

public class MealBuilderOne {
    private Meal meal = new Meal();

    public MealBuilderOne prepareVegMeal() {
        this.meal.addItem(new VegBurger());
        this.meal.addItem(new Coke());
        return this;
    }

    public MealBuilderOne prepareNonVegMeal() {
        this.meal.addItem(new ChickenBurger());
        this.meal.addItem(new Pepsi());
        return this;
    }

    public MealBuilderOne addItem(Item item) {
        this.meal.addItem(item);
        return this;
    }

    public Meal build() {
        final Meal finalMeal = this.meal;
        this.meal = new Meal();
        return finalMeal;
    }
}
