package polymorphism1;

public abstract class GeometricObject
{
    private String color;
    private double weight;
    public GeometricObject()
    {
       color="black";
       weight=1;
    }
    public  GeometricObject(String color,double weight)
    {
        this.color=color;
        this.weight=weight;
    }
     public String getColor()
     {
         return color;
     }
     public double getWeight()
     {
         return weight;
     }
     public void setColor(String color)
     {
         this.color=color;
     }
     public void setWeight(double weight)
     {
         this.weight=weight;
     }
     public abstract double findArea();
}
