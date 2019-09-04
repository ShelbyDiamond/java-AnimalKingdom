package animalKingdom;

public abstract class AbstractAnimals {
    private static int maxId = 0;
    private int id;
    private int yearDiscovered;
    private String name;

    // constructor
    public AbstractAnimals(int yearDiscovered, String name) {

        maxId++;
        id = maxId;

        this.yearDiscovered = yearDiscovered;
        this.name = name;
    }

    // Methods, behaviors

    public abstract String move();

    public abstract String breath();

    public abstract String reproduce();

    // getters
    public int getId() {
        return id;
    }

    public int getYearDiscovered() {
        return yearDiscovered;
    }

    public String getName() {
        return name;
    }

    // setters
    public void setYearDiscovered(int yearDiscovered) {
        this.yearDiscovered = yearDiscovered;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\t" + "Year Discovered: " + yearDiscovered;
    }
}
// Info on static keyword:
// https://www.geeksforgeeks.org/static-keyword-java/

// Overriding info:
// https://www.geeksforgeeks.org/overriding-in-java/

// abstract keyword info:
// https://www.geeksforgeeks.org/abstract-keyword-in-java/