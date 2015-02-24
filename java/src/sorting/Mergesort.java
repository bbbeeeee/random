package sorting;

import java.util.Arrays;

/**
 * Created by btru on 10/29/14.
 */
public class Mergesort {
    public static void main(String[] args){
        int[] array = {3, 1, 6, 3, 7, 2 ,1};

        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] input){
        int[] tmp = new int[input.length];
        mergeSort(input, tmp, 0, input.length - 1);
    }

    public static void mergeSort(int[] a, int[] tmp, int left, int right){
        if(left < right){
            int center = (left + right) / 2;
            mergeSort(a, tmp, left, center);
            mergeSort(a, tmp, center + 1, right);
            merge(a, tmp, left, center + 1, right);
        }
    }

    public static void merge(int[] a, int[] tmp, int left, int right, int rightEnd){
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd){
            if(a[left] < a[right])
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];
        }

        while(left <= leftEnd)
            tmp[k++] = a[left++];

        while(right <= rightEnd)
            tmp[k++] = a[right++];

        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }
}
