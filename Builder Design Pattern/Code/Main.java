public class Main
{
    public static void main(String[] args) {
        // Builder
        MealBuilder mealBuilder = new MealBuilder();

        // Client asks builder for a certain kind of meal
        System.out.println("Can I get a veggy meal");
        Meal veggyMeal = mealBuilder.prepareHealthyMeal();
        veggyMeal.displayMealItems();
        System.out.println("That'll be: " + veggyMeal.getCost() + "\n");

        // Client asks builder for another certain kind of meal
        System.out.println("Can I get a regular meal, something \"not-healthy\"");
        Meal meal = mealBuilder.prepareMeal();
        meal.displayMealItems();
        System.out.println("That'll be: " + meal.getCost());
    }
}