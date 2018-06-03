package com.demo;

public class BaloonDemo {
    public static void main (String[] args) {
        Baloon b1 = new Baloon();

        b1.up();


        Color color = new Color();
        color.define(0,0,1);

        b1.color = color;

        System.out.println(b1.color.getColorName());
        b1.repaint(0,1,0);

        System.out.println(b1.color.getColorName());


        System.out.println(b1.getAttitude());

    }
}