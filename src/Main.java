import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        System.out.println(set1);
        Set<Integer> set2 = new HashSet<>(Arrays.asList(0, 1, 2));
        System.out.println(set2);
        System.out.println(symmetricDifference(set1,set2));

    }

    private static String symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set3 = new HashSet<>(set1);
        set3.addAll(set2);
        Set<Integer> set4 = new HashSet<>(set1);
        set4.retainAll(set2);
        set3.removeAll(set4);
        return "Жооп: " + set3;
    }
}