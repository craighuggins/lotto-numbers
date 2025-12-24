import java.util.*;


/**
 * Write a description of class lotto here.
 *
 * @author Craig Huggins
 * @version 1.0
 */
public class lotto
{
    // instance variables - replace the example below with your own
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
            lottoNumbers.add(myrand.nextInt(46 - 1 + 1) + 1);
        }
        Collections.sort(lottoNumbers);
    }

    public void printNewSet() {
        for (int number : lottoNumbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        lotto newLotto = new lotto();
        newLotto.printNewSet();
    }
}
