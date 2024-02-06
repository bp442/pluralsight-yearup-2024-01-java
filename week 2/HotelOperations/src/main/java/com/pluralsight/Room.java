package com.pluralsight;

public class Room
{
    // create private variables
    private int numberOfBeds;
    private double price;
    private boolean occupied, dirty;
    // create a constructor that takes all variables

    public Room(int numBeds, double inputPrice, boolean inputIsOccupied, boolean inputIsDirty){
        numberOfBeds = numBeds;
        price = inputPrice;
        occupied = inputIsOccupied;
        dirty = inputIsDirty;
    }
    // create getters here (this class should not have any setters)
    public int getNumberOfBeds(){
        return numberOfBeds;
    }

    public double getPrice(){
        return price;
    }

    public boolean isOccupied(){
        return occupied;
    }

    public boolean isDirty(){
        return dirty;
    }

    public boolean isAvailable(){
        //returns true if room is not occupied and not dirty
        return !occupied && !dirty;
    }
}
