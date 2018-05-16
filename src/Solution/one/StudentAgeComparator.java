package Solution.one;

import java.util.Comparator;

/**
 *
 * @author Sathishkumar T
 */
public class StudentAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        //TODO: Compare ages of students s1 and s2
        return s1.getAge() - s2.getAge();
    }

}
