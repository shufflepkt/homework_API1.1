import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> resList1 = new ArrayList<>();

        for (Integer i : intList) {
            if (i > 0) {
                resList1.add(i);
            }
        }

        List<Integer> resList2 = new ArrayList<>();

        for (Integer i : resList1) {
            if (i % 2 == 0) {
                resList2.add(i);
            }
        }

        Collections.sort(resList2);

        for (Integer i : resList2) {
            System.out.println(i);
        }
    }
}