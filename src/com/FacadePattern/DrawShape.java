package com.FacadePattern;

public class DrawShape {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    DrawShape(){
        circle=new Circle();
        rectangle=new Rectangle();
        square=new Square();
    }
    public void drawCircle(){
         circle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
}
