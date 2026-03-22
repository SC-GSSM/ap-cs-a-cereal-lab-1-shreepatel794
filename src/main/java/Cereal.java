/**
 * Cereal.java
 *
 * @author – Shree Patel
 * @author – MWF 8:00
 *
 */
public class Cereal
{
    // private instance variables to hold info about a cereal from the data set
    // the name, calories, fiber, carbohydrates, and cups
    private String name; 
    private int calories; 
    private double fiber; 
    private double carbohydrates; 
    private int cups;

    // constructor that creates a cereal object
         public Cereal(String name, int calories, double fiber, double carbs, int cups) {
        this.name = name;
        this.calories = calories;
        this.fiber = fiber;
        this.carbs = carbs;
        this.cups = cups;
    }
    // accessor methods for each instance variable
     public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public double getFiber() {
        return fiber;
    }

    public double getCarbs() {
        return carbs;
    }

    public int getCups() {
        return cups;
    }

    /* toString method returns the values stored in the instance variables
       concatenated in a sentence starting with "Cereal: " */
       public String toString() {
        return "Cereal: " + name + " " + calories + " " + fiber + " " + carbs + " " + cups;
    }

}


