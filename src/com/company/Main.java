package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("If you would like to convert from an RGB triplet to a hexadecimal, enter 'RGB'.");
        System.out.println("If you would like to convert from a hexadecimal to an RGB triplet, enter 'hex'.");

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

            if(rNum < 0 || rNum > 255 || gNum < 0 || gNum > 255 || bNum < 0 || bNum > 255)
            {
                System.out.println("RGB triplet number can't be less than 0 or greater than 255.");
            }
            else
            {
                ColorConverter.rgbToHex(rNum, gNum, bNum);
            }
        }
        else if (convert.equalsIgnoreCase("hex"))
        {
            Scanner hexInput = new Scanner(System.in);

            System.out.println("Input the hexidecimal string in the form 'ffffff'");
            String hex = hexInput.next();

            if(hex.length() > 6)
            {
                System.out.println("Invalid hexidecimal input.");
            }
            else
            {
                ColorConverter.hexToRGB(hex);
            }
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}