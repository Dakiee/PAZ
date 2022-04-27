public class CircleTest
{
	public static void main (String args[])
	{
		Circle myCircle = new Circle(0,0,14) ;
		
		double xValue ;
		double yValue ;
		double radius ;
		
		xValue = myCircle.getX() ;
		yValue = myCircle.getY() ;
		radius = myCircle.getRadius() ;
		
		System.out.println("Toirgiin tuv ni " + xValue + "," + 
							yValue + " radius ni " + radius) ;
	}
}
