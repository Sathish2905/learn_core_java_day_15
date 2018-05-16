package Solution.one;

import java.util.Comparator;

/**
 *
 * @author Sathishkumar T
 */
public class StudentGpaDescendingComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        // TODO: Compare gpa's of students in descending order
        return (int) (1000 * (s2.getGPA() - s1.getGPA()));
    }

}
