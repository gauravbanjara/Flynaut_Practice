package ComparableAndComparator.Assignment.Comparator;

import java.util.Comparator;

class FirstCharComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return Character.compare(a.charAt(0), b.charAt(0));
    }
}

