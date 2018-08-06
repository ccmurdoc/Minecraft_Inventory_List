package edu.odu.cs.cs330.items;

import java.util.Scanner;

/**
 * This class represents one tool--as found in most video games. This includes
 * pickaxes and shovels.
 *
 * Tools may not be stacked. All Constructors must initialize Item::stackable
 * to false.
 */
public class Tool extends Item {

    protected double durability; ///< decreases each time the tool is used
    protected double speed;      ///< base harvest/mine speed
    protected String material;   ///< material out of which the tool is composed 
    protected String modifier;   ///< one of efficiency, fortune, or unbreaking
    protected int modifierLevel; ///< modifier level in the range 1 to 5

    /**
     * Default to a tool with an empty name
     */
    public Tool()
    {
        super("", false);

        this.durability    = 0;      
        this.speed         = 0;
        this.material      = new String();  
        this.modifier      = new String();   
        this.modifierLevel = 1;   
    }

    /**
     * Copy Constructor
     */
    public Tool(Tool src)
    {
        
    }

    /**
     * Retrieve tool durability
     */
    public double getDurability()
    {
        return this.durability;
    }

    /**
     * Set tool durability
     */
    public void setDurability(double durability)
    {
        this.durability = durability;
    }

    /**
     * Retrieve tool speed
     */
    public double getSpeed()
    {
        return this.speed;
    }

    /**
     * Set tool speed
     */
    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    /**
     * Retrieve tool Material
     */
    public String getMaterial()
    {
        return this.material;
    }

    /**
     * Set tool Material
     */
    public void setMaterial(String m)
    {
        this.material = m;
    }

    /**
     * Retrieve tool Modifier
     */
    public String getModifier()
    {
        return this.modifier;
    }

    /**
     * Set tool Modifier
     */
    public void setModifier(String m)
    {
        this.modifier = m;
    }

    /**
     * Retrieve tool Modifier Level
     */
    public int getModifierLevel()
    {
        return this.modifierLevel;
    }

    /**
     * Set tool Modifier Level
     */
    public void setModifierLevel(int level)
    {
        this.modifierLevel = level;
    }

    /**
     * Read Tool attributes from an input array
     */
    @Override
    public void read(Scanner s)
    {

    }

    /**
     * Clone--i.e., copy--this Tool
     */
    @Override
    public Item clone()
    {
        // replace this line
        return null;
    }

    /**
     * *Print* a Tool
     */
    @Override
    public String toString()
    {        
        // replace this line
        return "Not Yet Implemented";      
    }
    
}