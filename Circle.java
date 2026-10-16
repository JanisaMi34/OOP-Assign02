/*
@author Janisa Miles, qst18
@version 1

This is a Circle class that implements the Shape interface.
This class stores the Circle object's radius value
and calculates the area of the circle.
*/
public class Circle implements Shape{
    double radius;

    /*
    This method is a constuctor for the Circle class.
    It sets the radius value when a Circle object 
    is created.

    @param radius is a double that stores the 
    radius of the object given by the user.
    */
    public Circle(double radius){
        this.radius = radius;
    }

    /*
    This method calculates the area of the circle,
    @return area of the circle
    */
    public double getArea(){
        return Math.PI * (this.radius * this.radius);
    }


    /*
    This method gives class name.

    @return the name of the class, Circle.
    */
    public String getClassName(){
        return "Circle";
    }

    @Override 
    public String toString(){
        return this.getClassName() + " (r = " + this.radius + ")";
    }
}