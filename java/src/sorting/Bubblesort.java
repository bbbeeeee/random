package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by btru on 10/29/14.
 */
public class Bubblesort {
    public static void main(String[] args){
        int[] array = {3, 1, 6, 2, 48, 8};
        System.out.println(Arrays.toString(bubblesort(array)));
    }

    public static int[] bubblesort(int[] input){
        boolean swapped = true;
        int length = input.length;
        int temp;
        int j = 0;

        while(swapped){
            swapped = false;
            j++;
            for(int i = 0; i < length - j; i++){
                if(input[i] > input[i+1]){
                    temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    swapped = true;
                }
            }
        }

        return input;
    }
}
