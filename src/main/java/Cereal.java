/**
 * Cereal.java
 *
 * @author – Shree Patel
 * @author – MWF - 8am 
 *
 */
public class Cereal
{
    //private4 instant variables
    private String name;
    private int calories;
    private double fiber;
    private double carbs;
    private int cups;
    
    // constructor that creates a cereal object
    public Cereal(String name, int calories, double fiber, double carbs, int cups){
    this.name = name;
    this.calories = calories;
    this.fiber = fiber;
    this.carbs = carbs;
    this.cups = cups;
}

    // accessor methods for each instance variable
    public String getName(){return this.name;}
    public int getCal(){return this.calories;}
    public double getFiber(){return this.fiber;}
    public double getCarbs(){return this.carbs;}
    public int getCups(){return this.cups;}

    public void setName(String n){this.name = n;}
    public void setCal(int calo){this.calories = calo;}
    public void setFiber(double f){this.fiber = f;}
    public void setCarbs(double carb){this.carbs = carb;}
    public void setCups(int cup){this.cups = cup;}

    /* toString method returns the values stored in the instance variables
       concatenated in a sentence starting with "Cereal: " */
   public String toString(){
    return "Cereal: " + name + " Calories: " +calories +" Fiber: " + fiber + " Carbs: " + carbs + "Cups: " + cups;
   }
    

}


