/*
@author Janisa Miles, qst18
@version 1

This is a Rectangle class that implements the Shape interface.
This class stores the Rectangle object's witdth and length values
and calculates the area of the rectangle.
*/
public class Rectangle implements Shape{
    double width;
    double length;

    /*
    This method is a constuctor for the Rectangle class.
    It sets the width and length values when a Rectangle object 
    is created.

    @param width is a double that stores the 
    width of the object given by the user.

    @param length is a double that stores the 
    length of the object given by the user.
    */
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    /*
    This method calculates the area of the rectangle,
    @return area of the rectangle
    */
    public double getArea(){
        return this.width * this.length;
    }

    /*
    This method gives class name.

    @return the name of the class, Rectangle.
    */
    public String getClassName(){
        return "Rectangle";
    }

    @Override 
    public String toString(){
        return this.getClassName() + "( " + this.width + " x " + this.length + ")";
    }
}