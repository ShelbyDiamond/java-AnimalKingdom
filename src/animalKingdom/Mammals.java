package animalKingdom;

public class Mammals extends AbstractAnimals {

    // constructor
    public Mammals(int yearDiscovered, String name) {
        super(yearDiscovered, name);
    }

    @Override
    public String move() {
        return "move - walk";
    }

    @Override
    public String breath() {
        return "breath - lungs";
    }

    @Override
    public String reproduce() {
        return "reproduce - live births";
    }
}

// this super is ACCESSING the CONSTRUCTOR of AbstractAnimals.java

// In any object-oriented programming language,
// Overriding is a feature that allows a child class to provide a specific
// method that is already provided by one of its
// super-classes/parent classes. When a method in a
// subclass has the same name, same parameters or signature
// and same return type(or sub-type) as a method in its
// super-class, then the method in the subclass is said to
// override the method in the super-class.

// These are *OVERRIDING* the *ABSTRACT METHODS* that are in
// AbstractAnimals.java