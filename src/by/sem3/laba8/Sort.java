package by.sem3.laba8;

import java.util.Arrays;
import java.util.Comparator;

import static by.sem3.laba8.Main.array;
import static by.sem3.laba8.Main.typeOfSort;

class Sort implements Runnable {
    @Override
    public void run() {
        switch (typeOfSort) {
            case 1:
                Arrays.sort(array);
                break;
            case 2:
                Arrays.sort(array, (a, b) -> Integer.compare(b, a));
                break;
            case 3:
                Arrays.sort(array, (a, b) -> lengthOfNumber(a).compareTo(lengthOfNumber(b)));
                break;
            case 4:
                Arrays.sort(array, (a, b) -> lengthOfNumber(b).compareTo(lengthOfNumber(a)));
                break;
            default:
                return;
        }
    }

    private Integer lengthOfNumber(Integer item) {
        Integer length = 0;
        do {
            item /= 10;
            length++;
        } while (item != 0);
        return length;
    }
}
