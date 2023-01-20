package models;

import java.io.Serializable;

public class Shoe extends Armour implements Serializable {

    private final static long serialVersionUID = 1L;

    // Constructor
    public Shoe(String name, int durability, int defenseRating){
        super(name, durability, defenseRating);
    }

}
