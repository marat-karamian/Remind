package com.demo;

public class Baloon {
    public Color color;
    private double velocity;
    private double attitude;
    long id;

    public Baloon() {
        color = new Color(0, 0, 1);
    }

    public void up() {
        if (color.getBlue() == 1) {
            attitude++;
        }
    }

    public void repaint(int r, int g, int b) {
        color = new Color(r, g, b);
    }

    public void down() {
        if (attitude > 0) {
            attitude--;
        }
    }

    public double getAttitude() {
        return attitude;
    }

    public double calculate() {
        return velocity * attitude;
    }

    public double calculate(double vel, double alt) {
        return vel * alt;
    }
}