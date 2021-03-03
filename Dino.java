
/**
 * Write a description of class Dino here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Dino
{
    // instance variables - replace the example below with your own
    private int age;
    private String type;
    private int health;
    private String gender;
    private int battleCount;
    private boolean alive;
    private int wins;
    private double strength;
    public static int population;
    /**
     * Constructor for objects of class Dino
     */
    public Dino()
    {
        // initialise instance variables
        age = 0;
        type = "Dino";
        health = 10;
        battleCount = 0;
        strength = 0;
        population = 0;
        alive = true;
    }
    public Dino(String t)
    {
        type = t;
        health = 10;

    }
    public abstract boolean attack(Dino other);
    public void update(Dino loser) {
        loser.setHealth(loser.getHealth()-10);
        if (loser.getHealth()<0) {
            loser.setHealth(0);
        }
        this.setWins(this.getWins()+1);
        this.setBattleCount(this.getBattleCount()+1);
        loser.setBattleCount(loser.getBattleCount()+1);
    }
    public int getWins() {
        return wins;
    }
    public void setWins(int a) {
        this.wins = a;
    }
    
    public String getType() {
        return type;
    }
    public void setType(String t) {
        this.type = t;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String g) {
        this.gender = g;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        this.age = a;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int h) {
        this.health = h;
    }
    public String toString() {
        
        String answer = this.getType() + " " + this.getWins() + " " + this.battleCount;
        return answer;
    }
    public void ageUp() {
        if (health > 0) {
            this.age++;
            if (this.age < 10) {
                this.health += 10;
            }
            if (this.age > 25 && this.age < 30) {
                this.health -= 5;
            }
            if (this.age > 30) {
                this.health -= 10;
            }
        }
    }
    public int getBattleCount() {
        return battleCount;
    }
    public void setBattleCount(int a) {
        this.battleCount = a;
    }
    public double getStrength() {
        return strength;
    }
    public void setStrength(double a) {
        this.strength = a;
    }
    public boolean getAlive() {
        return alive;
    }
    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    double getBattleFactor(Dino other) {

        double rExp = ((double)this.getBattleCount())/((double)(this.getBattleCount()+other.getBattleCount()));

        double tmp1 = 0.67*(((double)this.getHealth())/100.0);

        double tmp2 = 0.33*rExp;

        return tmp1+tmp2;

    }
    public boolean equals(Dino d) {
        if (this.age == d.age && this.type.equals(d.type) && this.health == d.health && this.gender.equals(d.gender)) {
            
            return true;
        }else {
            return false;
        }
    }
    
}
