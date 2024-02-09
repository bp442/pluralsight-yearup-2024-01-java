package com.pluralsight.models;

import java.util.ArrayList;

public class Pizza
{
    private String size;
    private String sauce;
    private String cheese;
    private ArrayList<String> toppings;

    public Pizza()
    {
        size = "Small";
        sauce = "Tomato";
        cheese = "Mozzarella";
        toppings = new ArrayList<>();
    }

    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = "Small";

        if(size.equalsIgnoreCase("m")) this.size = "Medium";
        else if(size.equalsIgnoreCase("l")) this.size = "Large";
    }

    public String getSauce()
    {
        return sauce;
    }

    public void setSauce(String sauce)
    {
        this.sauce = "Tomato";

        if(sauce.equalsIgnoreCase("a")) this.sauce = "Alfredo";
        else if(sauce.equalsIgnoreCase("b")) this.sauce = "BBQ";

    }

    public String getCheese()
    {
        return cheese;
    }

    public void setCheese(String cheese)
    {
        this.cheese = "Mozzarella";

        if(cheese.equalsIgnoreCase("p")) this.cheese = "Provolone";
        else if(cheese.equalsIgnoreCase("a")) this.cheese = "American";
        else if(cheese.equalsIgnoreCase("c")) this.cheese = "Cheddar";

    }

    public ArrayList<String> getToppings()
    {
        return toppings;
    }

    public void addTopping(String topping)
    {
        toppings.add(topping);
    }

    public double getBasePrice()
    {
        double basePrice = 5.99;

<<<<<<< HEAD
        if(size.equalsIgnoreCase("medium"))
        {
            basePrice = 8.99;
        }
        else if(size.equalsIgnoreCase("large"))
=======
        if(size.equalsIgnoreCase("Medium"))
        {
            basePrice = 8.99;
        }
        else if(size.equalsIgnoreCase("Large"))
>>>>>>> 66ea21adbd1360306e498502302719e773c19029
        {
            basePrice = 11.99;
        }

        return basePrice;
    }

    public double getTotalPrice()
    {
        return getBasePrice() + (toppings.size() * 1.5);
    }
}


