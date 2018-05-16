package Solution.one;

import java.util.Comparator;

/**
 *
 * @author Sathishkumar T
 */
public class StudentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareToIgnoreCase(s2.getName());
    }

}
