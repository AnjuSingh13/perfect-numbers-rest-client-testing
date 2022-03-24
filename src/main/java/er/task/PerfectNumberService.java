package er.task;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * Description: This class have methods to
 * 1. Check if a given number is perfect.
 * 2. Find all perfect numbers between a range (start-end)
 */

public class PerfectNumberService {

    /**
     * This method is used to check if provided number is a perfect number or not.
     * Perfect numbers are those whose sum of divisors except itself is equal to
     * number itself. e.g 6=1+2+3
     * @param number which is number
     * @return result
     */
    public Boolean isItPerfect(Long number) {
        int sum = 0;
        if ( number > 0 )
        {
            //Looping here till number/2, (highest divisor of any number)
            for (int i = 1; i <= number/2; i++) {
                if (number % i == 0) {
                    sum = sum + i;
                }
            }
            return (sum == number);
        }
        return false;
    }
    /**
     * This method is used to provide list of perfect numbers between the given range
     * @param start which is start of the range
     * @param end which is end of the range
     * @return result
     */
    public List<Integer> checkForPerfectNumbers(int start, int end) {
        List<Integer> perfectNumbers = new ArrayList<>();
        for (long i = start; i <= end; i++) {

            if (isItPerfect(i)) {
                perfectNumbers.add((int) i);
            }
        }
        return perfectNumbers;
    }


}


