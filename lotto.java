import java.util.*;

/**
 * Write a description of class lotto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lotto
{
    // instance variables - replace the example below with your own
    //private int x;
    private ArrayList<Integer> lottoNumbers;

    /**
     * Constructor for objects of class lotto
     */
    public lotto()
    {
        // initialise instance variables
        lottoNumbers = new ArrayList<>();
        Random myrand = new Random();
        for (int i=0; i<6; i++) {
            lottoNumbers.add(myrand.nextInt(46));
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printNewSet() {
        for (int number : lottoNumbers) {
            System.out.println(number);
        }
    }
}
