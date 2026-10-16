/*
@author Janisa Miles, qst18
@version 1

This is a Square class that implements the Shape inheretance.
This class stores the Square object's side value
and calculates the area of the Square.
*/
public class Square implements Shape{
    double side;

    /*
    This method is a constuctor for the Square class.
    It sets the side value when a Square object is created.

    @param side is a double that stores the 
    side value of the object given by the user.
    */
    public Square(double side){
        this.side = side;
    }

    /*
    This method calculates the area of the square,
    @return area of the square
    */
    public double getArea(){
        return this.side * this.side;
    }

    /*
    This method gives class name.

    @return the name of the class, Square.
    */
    public String getClassName(){
        return "Square";
    }

    @Override 
    public String toString(){
        return this.getClassName() + " (s " + "= " + this.side + ")";
    }
}
