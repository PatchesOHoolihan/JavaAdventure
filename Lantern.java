package com.cscc.javaadventure;
import java.text.DecimalFormat;

// Jd-King-09022019- Creating a Lantern Class





public class Lantern {

    private Double weight;
    private Boolean lit ;
    private Boolean broken ;
    private String lanternDescription = "A tarnished, old lantern that has seen better days";;


    public Boolean extinguish (){
        this.setLit( false );
        lanternDescription = "A tarnished, old lantern that has seen better days. It is unlit";
    return  this.lit;
    }
    public void light(){
        this.setLit( true );
        lanternDescription = "A tarnished, old lantern that has seen better days. It glows softly";
    }



    public Boolean isLit() {
        this.setLit( true );
        return lit;
    }

    public Boolean breakLantern(){
        this.setBroken( true );
        return this.broken;
    }
    public Boolean fixLantern(){
        broken  = false;
        return this.broken;
    }


    Lantern() {



        weight =1.50;
       lit = false;
        broken = false;


    }



    public double getWeight() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double modifiedWeight = Double.parseDouble( decimalFormat.format(weight));
        return  modifiedWeight;
    }




   public boolean getLit() {return lit;}



   public void setLit(boolean newLit){
        this.lit = newLit;
   }

   public boolean getBroken() {
        return broken;}

    public void setBroken(boolean newBroken)
    {
        this.broken = newBroken;
    }

    public String getLanternDescription() {
        return lanternDescription;
    }





}
