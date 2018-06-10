package com.demo;

public class Color {
    private int red;
    private int green;
    private int blue;

    public static int test;

    public Color() {

    }

    public Color (int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getTest() {
        return test;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public String getColorName() {
        if (blue == 1 && red ==0 && green == 0) {
            return "Blue";
        }
        return "Unknown";
    }
}

