package com.qa.cake;

public class CakeTin {

    // Fields - Attr to desc the obj

    public String flavour;
    public int size;
    public boolean glutenFree;
    public String colour;

    // Methods - Func that the obj can do

    public void eatCake() {
        size -= 2;
    }

    // Constructor - 'methods' to create obj from a class
    // Constructors have NO RETURN (doesn't mean void, means no return)
    // Constructor name MUST BE THE CLASS NAME EXACTLY

    public CakeTin() {
        flavour = "Vanilla";
        size = 12;
        glutenFree = true;
        colour = "Beige";
    }
}
