
/**
 * Write a description of class DinoDriver2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;   
import java.util.ArrayList;
public class DinoDriver2
{
    public static void ageUp(Dino d) {
        Random r = new Random();
        int rand = r.nextInt(10);
        for (int i = 0; i <= rand; i++) {
            d.ageUp();
        }
        d.setBattleCount(d.getBattleCount()+rand);
    }

    public static void battleRound(ArrayList<Dino> dinoPop) {
        int populationSize = 0;
        for (Dino d : dinoPop) {
            if (d.getHealth() <= 0) {
                populationSize++;
            }
        }
        Dino.population = populationSize;
        for (int i = 0; i < 100; i++) {
            if (dinoPop.get(i).getHealth() > 0) {
                Random r = new Random();
                int rand = r.nextInt(100);
                int trys = 0;
                while (rand == i || dinoPop.get(i).getHealth() <= 0 || dinoPop.get(i).getHealth() <= 0) {
                    rand = r.nextInt(100);
                    trys++;
                    if (trys > dinoPop.size()) {
                        break;
                    }
                }
                if (trys > dinoPop.size()) {
                    break;
                }
                if (rand != i && dinoPop.get(i).getHealth() > 0 && dinoPop.get(rand).getHealth() > 0) {
                    boolean win = false;
                    double battle1 = dinoPop.get(i).getBattleFactor(dinoPop.get(rand))*(Math.random()*1.5)*dinoPop.get(i).getStrength();
                    double battle2 = dinoPop.get(rand).getBattleFactor(dinoPop.get(i))*(Math.random()*1.5)*dinoPop.get(rand).getStrength();
                    if (battle1 > battle2) {
                        dinoPop.get(i).update(dinoPop.get(rand));
                    }else {
                        dinoPop.get(rand).update(dinoPop.get(i));
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        Bronta d1 = new Bronta();
        TRex d2 = new TRex();
        ageUp(d1);
        ageUp(d2);
        Dino[] pop = new Dino[100];
        ArrayList<Dino> dinoPop = new ArrayList<Dino>();


        for (int i = 0; i < 100; i++) {
            Random r = new Random();
            int rand = r.nextInt(100);
            if (rand < 30) {
                dinoPop.add(new Stegosaurus());
                //pop[i] = new Stegosaurus();
            } else if (rand < 60) {
                dinoPop.add(new Bronta());
            } else {
                dinoPop.add(new TRex());
            }
        }

        for (int j = 0; j < 10; j++) {
            battleRound(dinoPop);
            int numDinos = 0;
            
            for (int i = 0; i < dinoPop.size(); i++) {
                if (dinoPop.get(i).getWins() > 0) {
                    numDinos++;
                    System.out.println(dinoPop.get(i).toString());
                }
            }
            if (numDinos <= 1) {
                break;
            }
            System.out.println("\n\n\n\n");
        }
        System.out.println("Finished");

        //System.out.println(d1.getBattleFactor(d2));
    }
}
