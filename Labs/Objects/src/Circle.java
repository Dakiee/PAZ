public class Circle
{
	private double x ;
	private double y ;
	private double radius ;
	public Circle (double x, double y, double radius)
	{
		this.x = x ;
		this.y = y ;
		this.radius = radius ;
	}
	public double getX()
	{
		return x ;
	}
	public double getY()
	{
		return y ;
	}
	public double getRadius()
	{
		return radius ;
	}
	public void setRadius(double newRadius)
	{
		this.radius = newRadius ;
	}
	public void move(double newX, double newY)
	{
		this.x = newX ;
		this.y = newY ;
	}
}