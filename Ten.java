package prac001;

import java.util.Arrays;

public class Ten {
    public static void main(String[] args) {
        reverseAnArray(new int[] {3,5,3,78,2,45});
    }

    private static void reverseAnArray(int[] array) {
        int reverseArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int temp=array[i];
            reverseArray[i]=array[array.length-i-1];
            array[i]=temp;
        }
        System.out.println(Arrays.toString(reverseArray));
    }

}
