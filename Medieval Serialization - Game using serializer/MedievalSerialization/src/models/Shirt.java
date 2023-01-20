package models;

import java.io.Serializable;

public class Shirt extends Armour implements Serializable {

    private final static long serialVersionUID = 1L;

    // Constructor
    public Shirt(String name, int durability, int defenseRating){
        super(name, durability, defenseRating);
    }
}
