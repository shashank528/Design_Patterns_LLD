package Behavioural.Decorator;

import java.sql.SQLOutput;

interface FoodItem
{
    String getDescription();
    double cost();
}
class Pizza implements FoodItem
{
    private String description;
    private double cost;
    public Pizza(String description, double  cost)
    {
        this.description=description;
        this.cost=cost;
    }
    @Override
    public String getDescription() {
       return this.description;
    }

    @Override
    public double cost() {

        return this.cost;
    }
}
class Burger implements FoodItem
{
    private String description;
    private double cost;
    public Burger(String description, double  cost)
    {
        this.description=description;
        this.cost=cost;
    }
    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double cost() {
        return this.cost;
    }
}
abstract class Decorator implements FoodItem
{
    protected FoodItem foodItem;
    public Decorator(FoodItem foodItem)
    {
        this.foodItem=foodItem;
    }

}
class ExtraCheesDecorator extends Decorator
{
    private double extraCheesePrice;
    public ExtraCheesDecorator(FoodItem foodItem,double extraCheesePrice) {
        super(foodItem);
        this.extraCheesePrice=extraCheesePrice;
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription()+" with extrachseese ";
    }

    @Override
    public double cost() {
      return foodItem.cost()+extraCheesePrice;
    }
}

public class DecoratorDemo {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("veg loaded",200);
        Burger burger = new Burger("full bonzana",300);
        ExtraCheesDecorator pizzawithExtrachhese = new ExtraCheesDecorator(pizza,19);
        ExtraCheesDecorator burgerwithextracheese = new ExtraCheesDecorator(burger,20);
        System.out.println(pizzawithExtrachhese.getDescription()+" "+pizzawithExtrachhese.cost());
        System.out.println(burgerwithextracheese.getDescription()+" "+burgerwithextracheese.cost());
    }
}
