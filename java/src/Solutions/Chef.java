package Solutions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by btru on 2/24/15.
 * Introduction
     A chef who owns his own restaurant has earned a reputation for creating
     fabulous new dishes by combining unusual ingredients. He has formulated a new
     recipe to release in conjunction with the opening of two new restaurants. The
     recipe uses ginger soda as one of the ingredients of a mushroom sauce, and the
     chef is very particular about the quality and flavor of the ginger soda. He found a
     supplier in Europe that produces a high-quality ginger soda he wants to
     purchase, but they only sell it in liters and he has specified the required quantity
     in gallons.

    Write a program to convert liters to gallons. There are 3.785 liters in one gallon.

    Sample Input
    The input will be a single integer representing a number of liters.
        144

    Sample Output
    The program must print the equivalent number of gallons, rounded to the nearest integer.
        38
 */
public class Chef {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("inputs/chef.txt"));

        int i;
        // Change this reading if necessary
        while(input.hasNextLine()){
            i = input.nextInt();
            System.out.println((int) (i / 3.785));
        }
    }
}
