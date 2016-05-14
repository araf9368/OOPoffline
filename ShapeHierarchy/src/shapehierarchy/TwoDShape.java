/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapehierarchy;

/**
 *
 * @author user
 */
public class TwoDShape extends Shape{
    TwoDShape(int r)
    {
        super(r);
    }
    TwoDShape(int l,int w)
    {
        super(l,w);
    }
}

class Circle extends TwoDShape{
    Circle(int rad)
    {
        super(rad);
    }
    public double area(){return  3.1416*getRad()*getRad();}
}

class Rectangle extends TwoDShape{
    Rectangle(int l,int w)
    {
        super(l,w);
    }
    public double area(){return  getLen()*getWid();}
}

class Triangle extends TwoDShape{
    Triangle(int l,int w)
    {
        super(l,w);
    }
    public double area(){return  .5*getLen()*getWid();}
}
