public class MealBuilder
{
    public Meal prepareHealthyMeal() {
        Meal healthyMeal = new Meal();
        healthyMeal.addItem(new VeggyBurger());
        healthyMeal.addItem(new Water());
        return healthyMeal;
    }

    public Meal prepareMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenSandwhich());
        meal.addItem(new DrPepper());
        return meal;
    }
}