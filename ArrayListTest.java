import java.util.ArrayList;
/**
 * Write a description of class ArrayListTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayListTest
{
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        Integer num = new Integer(5);
        myList.add(num);
        
        for (int i = 0; i < 25; i++) {
            int random = (int)(Math.random()*100.0);
            Integer in = new Integer(random);
            myList.add(in);
            //System.out.println(myList.get(i));
        }
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).intValue() % 5 == 0) {
                myList.remove(i);
                i--;
                System.out.println("removed");
            }
        }
        for (Integer x : myList) {
            System.out.println(x);
        }
    }
}
