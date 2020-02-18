import java.util.*;

abstract class Character {

    protected String name;
    protected String species;
    protected int health;
    protected int baseAttack;
    protected String attackItem;
    protected String DefenseItem;


    protected Character(String nameAssigned, String speciesAssigned){
            name = nameAssigned;
            species = speciesAssigned;
    }

    protected Character(String nameAssigned){
        name = nameAssigned;
}
 
}