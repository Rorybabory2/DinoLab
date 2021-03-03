
/**
 * Write a description of class Bronta here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bronta extends Dino
{
    // instance variables - replace the example below with your own
    private int numEaten;

    /**
     * Constructor for objects of class Bronta
     */
    public Bronta()
    {
        super("Bronta");
        setHealth(7);
        setStrength(0.4);
        // initialise instance variables
        numEaten = 0;
    }
    public boolean attack(Dino other) {
        double rand = Math.random();
        if (other.getType() == "Stegosaurus") {
            return (rand < 0.6);
        } else if (other.getType() == "Bronta") {
            return (rand < 0.50);
        } else if (other.getType() == "TRex") {
            return (rand < 0.25);
        } else {
            System.out.println("Unknown Dinosaur");
            return false;
        }
    }
}
