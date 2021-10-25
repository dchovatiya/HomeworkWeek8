package HomeworkWeek8;

import javafx.scene.Parent;

public class Cylinder extends Circle
{
    private double height;//instance variable
    public  Cylinder(double radius, double height) //constructor
    {
        super(radius);
        if(height<0)
        {
            this.height=0;
        }else
        {
            this.height=height;
        }
    }
    public double getHeight()
    {
        return height;
    }
    public double getVolume()
    {
        double volume=getArea()*getHeight();
        return volume;
    }
}
