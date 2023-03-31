public class Rectangle
{

    private double width;
    private double height;

    Rectangle()
    {
        width = 1.0;
        height = 1.0;
    }

    public void setWidth(double Width)
    {
        this.width = Width;
    }

    public void setHeight(double Height)
    {
        this.height = Height;
    }

    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    public double getPerimeter()
    {
        return 2*width + 2*height;
    }

    public double getArea()
    {
        return width*height;
    }
    public void showData()
    {
        System.out.println("The height of the rectangle is :  " + height);
        System.out.println("The width of the rectangle is :  " + width);
    }

    public void showArea()
    {
        System.out.println("The area of the rectangle is :  " + getArea());
    }
    public void showPerimeter()
    {
        System.out.println("The perimeter of the rectangle is :  " + getPerimeter());
    }

}
