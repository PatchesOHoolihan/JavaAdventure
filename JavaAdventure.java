package com.cscc.javaadventure;

public class JavaAdventure {
    public static void main(String[] args) {

        System.out.println("Welcome to JavaAdventure!");

        Character myCharacter = new Character();
        Lantern newLantern = new Lantern();
        TreasureChest myTreasureChest = new TreasureChest();

        System.out.println(myCharacter.getName());
        for (String key : myCharacter.getAttributes().keySet() ) {
            System.out.println(key + " " + myCharacter.getAttributes().get(key));

        }
        System.out.println( " " );
        System.out.println( myCharacter.getName() );
        System.out.println( myCharacter.getDescription() );
        System.out.println("Your hitpoints are equal to " + myCharacter.getHealth());

System.out.println( " " );

//            for (Object key : newLantern.getLanternAttributes().keySet() ) {
//                System.out.println( newLantern.getLanternAttributes().get(key));
//            }
//            System.out.println( " " );
//            System.out.println( newLantern.getLanternAttributes() );
//            System.out.println( newLantern.getWeight() );
//System.out.println( " " );
//System.out.println(myTreasureChest.getChestAttributes());






    }
}
