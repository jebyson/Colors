package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("If you would like to convert from an RGB triplet to a hexadecimal, enter 'RGB'.");
        System.out.println("If you would like to convert from a hexadecimal to an RGB triplet, enter 'hex'.");
        System.out.println("If you would like to convert from a color name, enter 'color'.");

        Scanner input = new Scanner(System.in);
        String convert = input.next();

        if (convert.equalsIgnoreCase("RGB"))
        {
            Scanner rgbInput = new Scanner(System.in);

            System.out.println("Enter your 'r' number.");
            int rNum = rgbInput.nextInt();
            System.out.println("Enter your 'g' number");
            int gNum = rgbInput.nextInt();
            System.out.println("Enter your 'b' number");
            int bNum = rgbInput.nextInt();

            ColorConverter.rgbToHex(rNum, gNum, bNum);
        }
        else if (convert.equalsIgnoreCase("hex"))
        {
            Scanner hexInput = new Scanner(System.in);

            System.out.println("Input the hexidecimal string in the form 'ffffff'");
            String hex = hexInput.next();

            ColorConverter.hexToRGB(hex);
        }
        else if (convert.equalsIgnoreCase("color"))
        {
            //ColorConverter.color();
        }
    }
}
