
/**
 * Write a description of class TRex here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TRex extends Dino
{
    // instance variables - replace the example below with your own
    private int numEaten;

    /**
     * Constructor for objects of class TRex
     */
    public TRex()
    {
        super("TRex");
        // initialise instance variables
        setHealth(10);
        setStrength(0.6);

        numEaten = 0;
    }
    public boolean attack(Dino other) {
        double rand = Math.random();
        if (other.getType() == "TRex") {
            return (rand < 0.5);
        } else if (other.getType() == "Bronta") {
            return (rand < 0.75);
        } else if (other.getType() == "Stegosaurus") {
            return (rand < 0.60);
        } else {
            System.out.println("Unknown Dinosaur");

            return false;
        }
    }
}
