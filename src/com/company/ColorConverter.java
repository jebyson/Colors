package com.company;

import java.util.*;

public class ColorConverter {

    public static void rgbTriplet()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 'r' number.");
        int rVal = input.nextInt();
        System.out.println("Enter your 'g' number");
        int gVal = input.nextInt();
        System.out.println("Enter your 'b' number");
        int bVal = input.nextInt();

        String r = Integer.toHexString(rVal);
        String g = Integer.toHexString(gVal);
        String b = Integer.toHexString(bVal);

        String hexVal = r + g + b;
        System.out.println("The hexadecimal value is: " + hexVal);
    }

    public static void hexadecimal(String x)
    {
        String r = "" + Integer.valueOf(x.substring(0, 2), 16);
        String g = "" + Integer.valueOf(x.substring(2, 4), 16);
        String b = "" + Integer.valueOf(x.substring(4, 6), 16);

        String rgbVal = "(" + r + ", " + g + ", " + b + ")";
        System.out.println("The RGB triplet value is: " + rgbVal);
    }

    public static void color()
    {

    }
}
