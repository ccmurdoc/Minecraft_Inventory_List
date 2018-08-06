package edu.odu.cs.cs330.items;

import java.util.Scanner;

/**
 * This class represents one Consumable Item--as found in most video games. This includes
 * food.
 *
 * Consumable Items must be stackable. All Constructors must initialize Item::stackable
 * to true.
 */
public class Consumable extends Item {
    protected String effect; ///< effect recieved by using the Item  
    protected int uses;      ///< number of times this Item can be used   

    /**
     * Default to a Comsumable Item with an empty name
     */
    public Consumable()
    {
        super("", true);

        this.effect = new String();
        this.uses   = 0;
    }

    /**
     * Copy Constructor
     */
    public Consumable(Consumable src)
    {
        super(src.name, true);

        this.effect = src.effect;    
        this.uses  = src.uses;
    }
    
    /**
     * Retrieve effect
     */
    public String getEffect()
    {
        return this.effect;
    }

    /**
     * Set effect
     */
    public void setEffect(String effect)
    {
        this.effect = effect;
    }

    /**
     * Retrieve number of uses
     */
    public int getNumberOfUses()
    {
        return this.uses;
    }

    /**
     * Set number of uses
     */
    public void setNumberOfUses(int u)
    {
        this.uses = u;
    }

    /**
     * Read Consumable Item attributes from an input array
     */
    @Override
    public void read(Scanner s)
    {
               
    }

    /**
     * Clone--i.e., copy--this Consumable Item
     */
    @Override
    public Item clone()
    {
        // replace this line
        return null;
    }

    /**
     * *Print* the Consumable Item
     */
    @Override
    public String toString()
    {
        // replace this line
        return "Not Yet Implemented";
    }
};