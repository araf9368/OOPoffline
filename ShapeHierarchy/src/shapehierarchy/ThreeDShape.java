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
public class ThreeDShape extends Shape{
    ThreeDShape(int l,int w,int h)
    {
        super(l,w,h);
    }
    ThreeDShape(int r)
    {
        super(r);
    }
}

class Cube extends ThreeDShape{
    Cube(int l,int w,int h){
        super(l,w,h);
    }
    public double area(){
        double a=2*((getLen()*getWid())+(getLen()*getHei())+(getHei()*getWid()));
        return a;
    }
    public double volume(){
        return getLen()*getWid()*getHei();
    }
}
class Sphere extends ThreeDShape{
    Sphere(int r){
        super(r);
   }
    public double area(){
        int r= getRad();
        return 4*3.1416*r*r;
    }
    public double volume(){
        int r= getRad();
        return (4.0/3)*3.1416*r*r*r;
    }
}
