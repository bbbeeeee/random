package easy;

import java.util.Arrays;

/**
 * Transposition
 */
public class Transposition {

    public static void main(String[] args){
        int[][] array = {
                {1, 3, 7, 0, 0, 0},
                {3, 5, 6, 1, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };

        int[][] test = transposition(array);

        for(int[] arr : test){
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int[][] transposition(int[][] input){
        int[][] output = new int[input[0].length][input.length];

        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < input[i].length; j++){
                output[j][i] = input[i][j];
            }
        }
        return output;
    }
}
