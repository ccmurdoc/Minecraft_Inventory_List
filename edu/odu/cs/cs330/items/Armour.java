package edu.odu.cs.cs330.items;

import java.util.Scanner;

/**
 * This class represents one piece of armour--as found in most video games. This includes
 * boots and helmets.
 *
 * Armour may not be stacked. All Constructors must initialize Item::stackable
 * to false.
 */
public class Armour extends Item { 
    
    protected double durability;   ///< decreases each time the armour is used
    protected double defense;      ///< damage that is blocked
    protected String material;     ///< material out of which the armour is composed 
    protected String modifier;     ///< one of protection, feather_falling, or unbreaking
    protected int    modiferLevel; ///< modifier level in the range 1 to 3
    protected String element;      ///< associated element--e.g., ice, fire, and lightning.

    /**
     * Default to a armour with an empty name
     */
    public Armour()
    {
        super("", false); 

        this.durability   = 0;      
        this.defense      = 0;
        this.material     = new String(); 
        this.modifier     = new String();  
        this.modiferLevel = 1;     
    }

    /**
     * Copy Constructor
     */
    public Armour(Armour src)
    {
        
    }

    /**
     * Retrieve armour durability
     */
    public double getDurability()
    {
        return this.durability;
    }
    /**
     * Set armour durability
     */
    public void setDurability(double durability)
    {
        this.durability = durability;
    }

    /**
     * Retrieve armour defense
     */
    public double getDefense()
    {
        return this.defense;
    }

    /**
     * Set armour defense
     */
    public void setDefense(double defense)
    {
        this.defense = defense;
    }         

    /**
     * Retrieve armour Material
     */
    public String getMaterial()
    {
        return this.material;
    }

    /**
     * Set armour Material
     */
    public void setMaterial(String m)
    {
        this.material = m;
    }

    /**
     * Retrieve armour Modifier
     */
    public String getModifier()
    {
        return this.modifier;
    }

    /**
     * Set armour Modifier
     */
    public void setModifier(String m)
    {
        this.modifier = m;
    }

    /**
     * Retrieve armour Modifier Level
     */
    public int getModiferLevel()
    {
        return this.modiferLevel;
    }

    /**
     * Set armour Modifier Level
     */
    public void setModiferLevel(int level)
    {
        this.modiferLevel = level;
    }

    /**
     * Retrieve armour Element
     */
    public String getElement()
    {
        return this.element;
    }

    /**
     * Set armour Element
     */
    public void setElement(String e)
    {
        this.element = e;
    }

    /**
     * Read Armour attributes from an input array
     */
    @Override
    public void read(Scanner s)
    {
        
    }

    /**
     * Clone--i.e., copy--this Armour
     */
    @Override
    public Item clone()
    {
        // replace this line
        return null;
    }

    /**
     * *Print* one Armour
     */
    @Override
    public String toString()
    {
        // replace this line
        return "Not Yet Implemented";
    }
}




