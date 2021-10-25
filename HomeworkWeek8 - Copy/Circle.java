package HomeworkWeek8;

public class Circle
{
    private double radius;
    public Circle(double radius) //constructor
    {
        if(radius<0)
        {
            this.radius=0;
        }else
        {
            this.radius=radius;
        }
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        double area=radius*radius*Math.PI;
        return area;
    }
}
