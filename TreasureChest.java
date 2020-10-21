package com.cscc.javaadventure;
import java.text.DecimalFormat;

// Jd-King-09022019- Creating a TreasureChest Class

public class TreasureChest {
    private String name;
    private double weight;
    private Boolean open;
    private Boolean locked;
    private String description;

    public Boolean openChest (){

        if (this.locked == false){
            this.setOpen( true );
            }

        return this.open;
    }
//Look at week4 Slide 40
    //Look at week 4 slide 94


    public void closeChest(){
        this.setOpen( false );
    }
    public void unlockChest(){
        this.setLocked( false );
        this.description = "A sturdy iron chest. It is unlocked";
    }
    public void lockChest(){
        this.setLocked( true );
        this.open = false;

        this.description = "A sturdy iron chest. It is locked";
    }


    TreasureChest() {
         weight = 10.00;
        open = false;
        locked = true;
        description = "A sturdy iron chest";

    }

    public double getWeight() {
        DecimalFormat decimalFormat = new DecimalFormat( "#.##" );
        double modifiedWeight = Double.parseDouble( decimalFormat.format( weight ) );
        return modifiedWeight;
    }

    public String getDescription() {
        return description;
    }


    public Boolean isOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public Boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

}

