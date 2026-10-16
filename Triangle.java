/*
@author Janisa Miles, qst18
@version 1

This is a Triangle class that implements the Shape interface.
This class stores the Triangle object's base and height values
and calculates the area of the triangle.
*/
public class Triangle implements Shape{
    double base;
    double height;

    /*
    This method is a constuctor for the Triangle class.
    It sets the base and height values when a Tiangle object 
    is created.

    @param base is a double that stores the 
    base of the object given by the user.

    @param height is a double that stores the 
    height of the object given by the user.
    */
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    /*
    This method calculates the area of the triangle,
    @return area of the triangle
    */
    public double getArea(){
        return (this.base * this.height) / 2;
    }

    /*
    This method gives class name.

    @return the name of the class, Triangle.
    */
    public String getClassName(){
        return "Triangle";
    }

    @Override 
    public String toString(){
        return this.getClassName() + " (b = " + this.base + ", h = " + this.height + ")";
    }
}