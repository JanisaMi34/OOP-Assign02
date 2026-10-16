public class Triangle implements Shape{
    double base;
    double height;


    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double getArea(){
        return (this.base * this.height) / 2;
    }

    public String getClassName(){
        return "Triangle";
    }

    @Override 
    public String toString(){
        return this.getClassName() + " (b = " + this.base + ", h = " + this.height + ")";
    }
}