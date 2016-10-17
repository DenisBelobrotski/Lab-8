package by.sem3.laba8;

class Output {
    public void outputArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if(i % 40 == 0){
                System.out.println();
            }
        }
    }

    public void outputBaseArray(Integer[] array) {
        System.out.println("Your input array:");
        this.outputArray(array);
        System.out.println("\nSize of array: " + array.length);
    }

    public void outputSortedArray(Integer[] array) {
        System.out.println("Your sorted array:");
        this.outputArray(array);
    }
}
