package by.sem3.laba8;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class Input {
    public int inputSize() throws InputMismatchException {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array:");
        size = scanner.nextInt();
        if(size < 1 || size > 100000){
            throw new InputMismatchException();
        }
        return size;
    }

    public Integer[] fillRandom(int size) {
        Integer[] array = new Integer[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000 + 1);
        }
        return array;
    }

    public int chooseSort() throws InputMismatchException {
        int choose;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What sorting do you want?\n1 - by increasing numbers\n2 - by decreasing numbers\n" +
                "3 - by increasing length\n4 - by decreasing length");
        choose = scanner.nextInt();
        if (choose < 1 || choose > 4) {
            throw new InputMismatchException();
        }
        return choose;
    }
}
