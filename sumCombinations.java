import java.util.ArrayList;
import java.util.List;

class PrintCombinations {
    public static void printCombinations(int num) {
       printCombinationsHelper(num, new ArrayList<>());
    }
    static void printCombinationsHelper(int num, List<Integer> current) {
        if (num == 0) {
            // Base case: print the current combination
            if (!current.isEmpty()) {
                System.out.print(current.get(0));
                for (int i = 1; i < current.size(); i++) {
                    System.out.print(" " + current.get(i));
                }
                System.out.println();
            }
            return;
        }

        for (int i = num; i>0; i--) {
            List<Integer> newCurrent = new ArrayList<>(current);
            newCurrent.add(i);
            printCombinationsHelper(num - i, newCurrent);
        }
    }
}
