package com.cscc.javaadventure;

// The JAObject (JavaAdventure Object) is the abstract base class
// for all game objects. It will allow us to deal with collections
// of game objects (like lanterns, treasure chests, etec) more
// effectively because they will share a common identity, and it
// will allow us to factor out duplicate code.

import java.util.HashMap;
import java.util.UUID;

public abstract class JAObject {

    public enum ModifierName {
        OPENMODIFIER,
        CLOSEDMODIFIER,
        LOCKEDMODIFIER,
        UNLOCKEDMODIFIER,
        LITMODIFIER,
        UNLITMODIFIER,
        STRONGMODIFIER
    }

    // A unique string identifier
    private String objectID;

    // Common variables used by all game objects
    private String name;
    private Double weight;
    private String description;
    private HashMap<ModifierName, String> descriptionModifiers;

    // Base constructor
    public JAObject() {
        this.objectID = UUID.randomUUID().toString();
        this.descriptionModifiers = new HashMap<ModifierName, String>();
    }

    // Getter for objectID
    public String getObjectID() {
        return this.objectID;
    }

    // Getter and setter for name
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    // Getter and setter for weight
    public Double getWeight() {
        return this.weight;
    }
    public void setWeight(Double newWeight) {
        this.weight = newWeight;
    }

    // Getter and setter for description
    public void setDescription(String baseDescription) {
        this.description = baseDescription;
    }
    public String getDescription() {
        // Any class which extends JAObject must implement setupModifiers
        // This function asks the object to generate a collection of
        // description modifiers based on its state (such as open or closed,
        // lit or unlit, etc). The getDescription method then appends those
        // description modifiers to the base description, generating a
        // complete description of the object.
        setupDescriptionModifiers();

        // The full description begins as being the same as the base description
        String fullDescription = this.description;

        // For each key in the descriptionModifiers HashMap, retrieve the
        // value. Those values are modifiers to the description such as
        // "It is lit." Append all the modifiers to the base description
        // making sure to include a space between each one.
        for (ModifierName modifierKey : this.descriptionModifiers.keySet()) {
            fullDescription += " " + this.descriptionModifiers.get(modifierKey);
        }

        return fullDescription;
    }

    // Add a description modifier entry to the HashMap
    public void addDescriptionModifier(ModifierName modifierName, String modifierValue) {
        this.descriptionModifiers.put(modifierName, modifierValue);
    }
    // Remove a description modifier entry from the HashMap
    public void removeDescriptionModifier(ModifierName modifierName) {
        this.descriptionModifiers.remove(modifierName);
    }
    // Clear the description modifier HashMap of all entries
    public void clearDescriptionModifiers() {
        this.descriptionModifiers.clear();
    }
    // Get the full list of description modifiers
    public HashMap<ModifierName, String> getDescriptionModifiers() {
        return this.descriptionModifiers;
    }
    // Abstract method used by getDescription()
    public abstract void setupDescriptionModifiers();

}