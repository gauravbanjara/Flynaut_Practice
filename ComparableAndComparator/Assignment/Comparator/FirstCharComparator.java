package ComparableAndComparator.Assignment.Comparator;

import java.util.Comparator;

class FirstCharComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return Character.compare(s1.charAt(0), s2.charAt(0));
    }
}

