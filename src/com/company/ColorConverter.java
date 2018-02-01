package com.company;

public class ColorConverter {

    public static String rChar, rChar2, gChar, gChar2, bChar, bChar2, hexEquivalent;
    public static int rVal, rRem, gVal, gRem, bVal, bRem;

    public static char r1, r2, g1, g2, b1, b2;
    public static int r1Num, r2Num, g1Num, g2Num, b1Num, b2Num, rTotal, gTotal, bTotal;
    public static String RGBEquivalent;

    public static void rgbToHex(int r, int g, int b)
    {
        rVal = r/16;
        rRem = r%16;
        gVal = g/16;
        gRem = g%16;
        bVal = b/16;
        bRem = b%16;

        convertRGB();
        hexEquivalent = rChar + rChar2 + gChar + gChar2 + bChar + bChar2;
        System.out.println("The hexadecimal equivalent of your input is: " + hexEquivalent);
    }

    public static void hexToRGB(String x)
    {
        x = x.toUpperCase();
        char [] xx = x.toCharArray();
        r1 = xx[0];
        r2 = xx[1];
        g1 = xx[2];
        g2 = xx[3];
        b1 = xx[4];
        b2 = xx[5];

        convertHEX();

        rTotal = r1Num + r2Num;
        gTotal = g1Num + g2Num;
        bTotal = b1Num + b2Num;
        RGBEquivalent = "(" + rTotal + ", " + gTotal + ", " + bTotal + ")";
        System.out.println("The RGB triplet equivalent of your input is: " + RGBEquivalent);
    }

    public static void convertHEX()
    {
        for(int j = 10; j < 20; j++)
        {
            if(r1 == (char)(j + 55))
            {
                r1Num = 16 * j;
            }
            if(r1 == (char)(j + 38))
            {
                r1Num = (j - 10) * 16;
            }
        }
        for(int j = 10; j < 20; j++)
        {
            if(r2 == (char)(j + 55))
            {
                r2Num = 16 * j;
            }
            if(r2 == (char)(j + 38))
            {
                r2Num = j - 10;
            }
        }
        for(int j = 10; j < 20; j++)
        {
            if(g1 == (char)(j + 55))
            {
                g1Num = 16 * j;
            }
            if(g1 == (char)(j + 38))
            {
                g1Num = (j - 10) * 16;
            }
        }
        for(int j = 10; j < 20; j++)
        {
            if(g2 == (char)(j + 55))
            {
                g2Num = 16 * j;
            }
            if(g2 == (char)(j + 38))
            {
                g2Num = j - 10;
            }
        }
        for(int j = 10; j < 20; j++)
        {
            if(b1 == (char)(j + 55))
            {
                b1Num = 16 * j;
            }
            if(b1 == (char)(j + 38))
            {
                b1Num = (j - 10) * 16;
            }
        }
        for(int j = 10; j < 20; j++)
        {
            if(b2 == (char)(j + 55))
            {
                b2Num = 16 * j;
            }
            if(b2 == (char)(j + 38))
            {
                b2Num = j - 10;
            }
        }
    }

    public static void convertRGB()
    {
        for(int j = 10; j < 16; j++)
        {
            if(rVal == j)
            {
                rChar = "" + (char)(j + 55);
            }
            if(rVal >= 0 && rVal <= 9)
            {
                rChar = "" + rVal;
            }
        }
        for(int j = 10; j < 16; j++)
        {
            if(rRem == j)
            {
                rChar2 = "" + (char)(j + 55);
            }
            if(rRem >= 0 && rRem <= 9)
            {
                rChar2 = "" + rRem;
            }
        }
        for(int j = 10; j < 16; j++)
        {
            if(gVal == j)
            {
                gChar = "" + (char)(j + 55);
            }
            if(gVal >= 0 && gVal <= 9)
            {
                gChar = "" + gVal;
            }
        }
        for(int j = 10; j < 16; j++)
        {
            if(gRem == j)
            {
                gChar2 = "" + (char)(j + 55);
            }
            if(gRem >= 0 && gRem <= 9)
            {
                gChar2 = "" + gRem;
            }
        }
        for(int j = 10; j < 16; j++)
        {
            if(bVal == j)
            {
                bChar = "" + (char)(j + 55);
            }
            if(bVal >= 0 && bVal <= 9)
            {
                bChar = "" + bVal;
            }
        }
        for(int j = 10; j < 16; j++)
        {
            if(bRem == j)
            {
                bChar2 = "" + (char)(j + 55);
            }
            if(bRem >= 0 && bRem <= 9)
            {
                bChar2 = "" + bRem;
            }
        }
    }
}