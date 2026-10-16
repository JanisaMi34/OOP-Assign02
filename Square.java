public class Square implements Shape{
    double side;


    public Square(double side){
        this.side = side;
    }

    public double getArea(){
        return this.side * this.side;
    }

    public String getClassName(){
        return "Square";
    }

    @Override 
    public String toString(){
        return this.getClassName() + " (s " + "= " + this.side + ")";
    }
}
