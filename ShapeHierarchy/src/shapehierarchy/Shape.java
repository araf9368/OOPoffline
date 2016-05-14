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
public class Shape {
    private int length;
    private int width;
    private int height;
    private int radius;
    Shape(int r){
        radius=r;
    }
    Shape(int l,int w){
        length = l;
        width = w;
    }
    Shape(int l,int w,int h){
        length = l;
        width = w;
        height = h;
    }
    int getRad()
    {
        return radius;
    }
    
    int getLen()
    {
        return length;
    }
    int getWid()
    {
        return width;
    }
    int getHei()
    {
        return height;
    }
    
}
