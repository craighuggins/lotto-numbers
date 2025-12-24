import java.util.*;

/**
 * A series of random numbers for playing slikpik lottery
 *
 * @author Craig Huggins
 * @version 1.0
 */
public class lotto
{
    // instance variables
    private ArrayList<Integer> lottoNumbers;

    /**
     * Constructor for objects of class lotto
     */
    public lotto()
    {
        // initialise instance variables
        lottoNumbers = new ArrayList<>();
        Random myrand = new Random();
        
        // add numbers to collection
        while (lottoNumbers.size() < 6) {
            var newNumber = myrand.nextInt(46 - 1 + 1) + 1;

            // Ensure numbers are unique
            if (!(lottoNumbers.contains(newNumber))) {
                lottoNumbers.add(newNumber);
            }
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
