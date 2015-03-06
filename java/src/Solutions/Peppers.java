package Solutions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by btru on 3/6/15.
 * Introduction
     Peter’s Popular Prime Pepper Plant provides packs of
     peppers in packages of 6, 11, or 13 peppers. The
     price to prepare each package is the same, regardless
     of size.
     Your program should take as input an integer less than
     1000. It should find the cheapest combination of packages to
     ship that number of peppers.

    Sample Input
     The input will consist of a single integer, representing the count of peppers.
     Example 1
        42
     Example 2
        55
     Example 3
        27
     Example 4
        88

    Sample Output
     The program should display the cheapest combination of packages to ship the count of peppers. If the
     same minimum number of packages can be obtained in two ways, choose the one that uses more of the
     size-13 packages.
     Example 1
         42 peppers can be packed most economically in:
         1 package of 13
         1 package of 11
         3 packages of 6
         5 total packages.
     Example 2
         55 peppers can be packed most economically in:
         5 packages of 11
         5 total packages.
         Example 3
         27 peppers cannot be packed.
     Example 4
         88 peppers can be packed most economically in:
         5 packages of 13
         1 package of 11
         2 packages of 6
         8 total packages
 */
public class Peppers {
    // 6, 11, 13

    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("inputs/peppers.txt"));
        int total, num6 = 0, num11 = 0, num13 = 0;

        // Change this reading if necessary
        while(input.hasNextLine()){
            boolean good = false;
            total = input.nextInt();

            // Want to first attempt for majority of higher, if can't go to lower, and if can't go to lower
            //System.out.println(total + " peppers cannot be packed");


            int i6, i11, i13, m6, m11, m13;
            i6 = total / 6;
            i11 = total / 11;
            i13 = total / 13;
            m6 = total % 6;
            m11 = total % 11;
            m13 = total % 13;
            int _total = 0;
            int r13 = total / 13;


            int rem13;
            num13 = r13;


            while(!good){

                // Start with 13s

                if(m13 < 6){
                    _total = r13 * 13;
                } else if(m13 == 11){
                    num11 = 1;
                    good = true;
                } else if(m13 == 6){
                    num6 = 1;
                    good = true;
                }

                rem13 = total - _total;


//
//                if(rem13)
                //System.out.println(rem13);
                good = true;
            }


            System.out.println(num6);
            System.out.println(num11);
            System.out.println(num13);

        }
    }
}
