package prac001;

import java.util.Arrays;

public class Nine {

    public static void main(String[] args) {
        sortAnArray(new int[] {3,5,3,78,2,45});
    }


    public static void sortAnArray(int[] array){
        int temp = 0;
        for (int i =0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    //Swapping and pushing lower number on left
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }

        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(array));
    }
}
