public class Rectangle implements Shape{
    double width;
    double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public String getClassName(){
        return "Rectangle";
    }

    @Override 
    public String toString(){
        return this.getClassName() + "( " + this.width + " x " + this.height + ")";
    }
}