package edu.odu.cs.cs330;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

import edu.odu.cs.cs330.items.*;

public class Storage {
    /**
     * Assignment 5: Item Storage in Java
     *
     * @param argv[1] items filename
     * @param argv[2] inventories filename
     */
    public static void main(String[] argv)
    {      
        Inventory inv = null;
        int inv_size  = 10; // Inventory Size

        if(argv.length < 1){
            System.err.println("Usage: java -jar Storage.jar items-file");
            System.exit(1);
        }

        // If an inventory size was specified, parse it.
        if(argv.length == 2){
            try{
                inv_size = Integer.parseInt(argv[1]);
            }
            catch(NumberFormatException e) {
                System.err.println("Inventory size must be an integer");
                System.exit(2);
            }

            // Default to 10 if inv_size is invalid--i.e., <= 0
            if(inv_size < 1) {
                inv_size = 10;
            }
        }

        try {
            BufferedReader infile = new BufferedReader(new FileReader(argv[0]));

            inv = createInventory(infile, inv_size);

            infile.close();
        }
        catch(IOException e) {
            System.err.println("Error: " + argv[0] + " could not be opened or read");
            System.exit(3);
        }

        // Print the Inventory
        printInventorySummary(inv);
    }

    /**
     * Read an input stream and generate an Inventory
     *
     * @param ins source from which to read Items
     * @param size desired number of Inventory slots
     *
     * @return initialized Inventory
     *
     * @throws IOException if an input error occurs
     */
    public static Inventory createInventory(BufferedReader ins, int size)
        throws IOException
    {
        Scanner   s         = new Scanner(ins);
        Inventory inventory = new Inventory(size);        

        System.out.println("Processing Log:");

        while(s.hasNext()){
            Item item = ItemFactory.parseItemLine(s);           

            if(item != null){            
                boolean success = inventory.addItems(new ItemStack(item));

                if(success) {
                    System.out.println(" (S) " + item.getName());  
                }
                else {
                   System.out.println(" (D) " + item.getName());  
                }  
            }               
        }
        System.out.println();

        return inventory;
    }

    /**
     * Print the final Inventory summary
     * 
     * @param inv Inventory to print
     */
    public static void printInventorySummary(Inventory inv)
    {
        System.out.println("Player Storage Summary:");
        System.out.println(inv);
    }
}