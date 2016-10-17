package by.sem3.laba8;

import java.util.InputMismatchException;

public class Main {
    static Integer[] array;
    static int typeOfSort;
    static Sort sort;

    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();
        sort = new Sort();
        Thread sortingThread = new Thread(sort);
        try {
            array = input.fillRandom(input.inputSize());
            output.outputBaseArray(array);
            typeOfSort = input.chooseSort();
            sortingThread.start();
            sortingThread.join();
            output.outputSortedArray(array);
        } catch (InputMismatchException e) {
            System.out.println("Uncorrect input number!");
        } catch (InterruptedException e) {
            System.out.println("The thread was interrupted!");
        }
    }
}

