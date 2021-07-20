package com.FacadePattern;

public class FacadeClass {
    public static void main (String[] args) {
        DrawShape drawShape=new DrawShape();
        drawShape.drawCircle();
        drawShape.drawSquare();
        drawShape.drawRectangle();
    }
}
