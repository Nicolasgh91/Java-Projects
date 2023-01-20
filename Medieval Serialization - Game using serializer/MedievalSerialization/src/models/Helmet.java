package models;

import java.io.Serializable;

public class Helmet extends Armour implements Serializable {

    private final static long serialVersionUID = 1L;
    public Helmet(String name, int durability, int defenseRating){
        super(name, durability, defenseRating);
    }
}
