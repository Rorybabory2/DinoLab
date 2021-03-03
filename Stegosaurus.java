
/**
 * Write a description of class Stegosaurus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Stegosaurus extends Dino
{
    // instance variables - replace the example below with your own
    private int numEaten;

    /**
     * Constructor for objects of class Stegosaurus
     */
    public Stegosaurus()
    {
        super("Stegosaurus");
        // initialise instance variables
        setHealth(20);
        setStrength(0.2);

        numEaten = 0;
    }
    public boolean attack(Dino other) {
        double rand = Math.random();
        if (other.getType() == "Stegosaurus") {
            return (rand < 0.5);
        } else if (other.getType() == "Bronta") {
            return (rand < 0.40);
        } else if (other.getType() == "TRex") {
            return (rand < 0.40);
        } else {
            System.out.println("Unknown Dinosaur");

            return false;
        }
    }
    
}
