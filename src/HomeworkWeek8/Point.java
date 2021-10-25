package HomeworkWeek8;

import java.awt.*;

public class Point
{
    private int x,y;//instance variables
    public Point()// first constructor
    {

    }
    public Point(int x, int y) //second constructor
    {
        this.x=x;
        this.y=y;
    }
    //getter and setter methods to get and set values.
    public int getX()
    {
        return x;
    }
    public void setX(int x)
    {
        this.x=x;
    }
    public int getY()
    {
        return y;
    }
    public void setY(int y)
    {
        this.y=y;
    }
    public double distance()
    {
        return distance(0,0);
    }
    public double distance(int x, int y)
    {
        System.out.println("this.x and this.y "+this.x +" "+ this.y);
        return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
    }
    public double distance(Point secondPoint)
    {
        return distance(secondPoint.x, secondPoint.y);
    }

    public static void main(String[] args)
    {
        Point first=new Point(6,5); //second cons is called
        Point second=new Point(3,1); //second cons is called
        System.out.println("distance(0,0)="+first.distance());
        System.out.println("distance(second)="+first.distance(second));
        System.out.println("distance(2,2)="+first.distance(2,2));
        Point point=new Point();
        System.out.println("distance()="+point.distance());

    }
}
