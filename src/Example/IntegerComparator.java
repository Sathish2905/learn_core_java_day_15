package Example;

import java.util.Comparator;

/**
 *
 * @author Sathishkumar T
 */
public class IntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer t1, Integer t2) {
        return t1 - t2;
    }

}
