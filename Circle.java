public class Circle implements Shape{
    double radius;


    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * (this.radius * this.radius);
    }

    public String getClassName(){
        return "Circle";
    }

    @Override 
    public String toString(){
        return this.getClassName() + " (r = " + this.radius + ")";
    }
}