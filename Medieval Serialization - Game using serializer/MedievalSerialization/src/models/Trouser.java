package models;

import java.io.Serializable;

public class Trouser extends Armour implements Serializable {

    private final static long serialVersionUID = 1L;

    // Constructor
    public Trouser(String name, int durability, int defenseRating){
        super(name, durability, defenseRating);
    }

}
