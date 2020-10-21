package com.cscc.javaadventure;

public class Sword extends JAObject {
    private Integer damage;
    private Boolean twoHanded;

    Sword() {
        setName( "Sword" );
        setWeight( 8.0 );
        setDescription( "A razor sharp broadsword forged from dark steel" );
        this.damage = 10;
        this.twoHanded = true;

    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Boolean getTwoHanded() {
        return twoHanded;
    }

    public void setTwoHanded(Boolean twoHanded) {
        this.twoHanded = twoHanded;
    }

    public void setupDescriptionModifiers() {
        {
        }
    }
}