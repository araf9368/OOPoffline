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
public class ShapeHierarchy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle crc=new Circle(5);
        Rectangle rec=new Rectangle(5, 10);
        Triangle tri=new Triangle(5,10);
        Cube cb=new Cube(10,20,30);
        Sphere sp=new Sphere(5);
        System.out.println("The area of a Circle is    : "+crc.area());
        System.out.println("The area of a Rectangle is : "+rec.area());
        System.out.println("The area of a Triangle is  : "+tri.area());
        System.out.println("The area of a Cube is      : "+cb.area());
        System.out.println("The volume of a Cube is    : "+cb.volume());
        System.out.println("The area of a Sphere is    : "+sp.area());
        System.out.println("The volume of a Sphere is  : "+sp.volume());
        
        
    }
    
}
