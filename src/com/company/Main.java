package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("If you would like to convert from an RGB triplet, enter 'RGB'.");
        System.out.println("If you would like to convert from a hexadecimal, enter 'hex'.");
        System.out.println("If you would like to convert from a color name, enter 'color'.");

        Scanner input = new Scanner(System.in);
        String convert = input.next();

        if (convert.equalsIgnoreCase("RGB"))
        {
            ColorConverter.rgbTriplet();
        }
        else if (convert.equalsIgnoreCase("hex"))
        {
            System.out.println("Input the hexidecimal string in the form 'ffffff'");
            Scanner hexInput = new Scanner(System.in);
            String hex = hexInput.next();

            ColorConverter.hexadecimal(hex);
        }
        else if (convert.equalsIgnoreCase("color"))
        {
            ColorConverter.color();
        }
    }
}
