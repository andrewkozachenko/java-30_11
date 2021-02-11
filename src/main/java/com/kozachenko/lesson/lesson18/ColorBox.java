package com.kozachenko.lesson.lesson18;

public class ColorBox {
    private int red;
    private int green;
    private int blue;
    private String colorName;

    public ColorBox() {
    }

    public ColorBox(int red, int green, int blue, String colorName) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.colorName = colorName;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
}
