package com.cscc.javaadventure;
import java.util.HashMap;
// Jd-King-09022019- Character Class
/*

The Character class represents a player in the JavaAdventure game.
 */
public class Character {
    /*
    Private data members of the Character Class
     */

    // The name of the character
    private String name;
    // A number representing the amount of health a character
    private Integer health;
    // The text description of the character
    private String description;
    // A collection of attributes such as strength or dexterity.
    // Each attribute has a name and an integer value
    private HashMap<String, Integer> attributes;

    // The constructor creates a new character object with default values.
    Character(){

        // Setup a default character
        name = "Nameless Adventurer";
        health = 10;
        // Remove the descriptor before submitting
        description = "ITS CHA BOIIIIII";
        attributes = new HashMap<String, Integer>();

        attributes.put("Strength", 10);
        attributes.put("Constitution", 10);
        attributes.put("Intelligence", 10);
        attributes.put("Wisdom", 10);
        attributes.put("Dexterity", 10);
        attributes.put("Charisma", 10);
    }

    /*
    Getters and Setters for private data members
     */

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public Integer getHealth() {
        return health;
    }
    public void setHealth(Integer newHitPoints) {
        this.health = newHitPoints;
    }

    public String getDescription() {
        return description;
    }
    public void setHitPoints(String newDescription) {
        this.description = newDescription;
    }

    public HashMap<String, Integer> getAttributes() {
        return attributes;
    }

    public void setAttributes(HashMap<String, Integer> newAttributes){
        this.attributes = newAttributes;
    }
}




