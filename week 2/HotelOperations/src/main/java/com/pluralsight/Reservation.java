package com.pluralsight;

public class Reservation
{
    private String roomType;
    private double pricePerNight;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(){
        roomType = "king";
        pricePerNight = 139;
        numberOfNights = 0;
        weekend = false;
    }

    public void setRoomType(String inputRoomType){
        roomType = inputRoomType;
    }

    public String getRoomType(){
        return roomType;
    }

    public double getPrice(){
        return pricePerNight * numberOfNights;
    }

    public int getNumberOfNights(){
        return numberOfNights;
    }

    public void setNumberOfNights(int numNights){
        numberOfNights = numNights;
    }

    public boolean isWeekend(){
        return weekend;
    }

    public void setIsWeekend(boolean isWeekend){
        weekend = isWeekend;
    }

    public double getReservationTotal(){
        if(weekend){
            return (1.1) * (numberOfNights * pricePerNight);
        }
        else{
            return numberOfNights * pricePerNight;
        }
    }
}
