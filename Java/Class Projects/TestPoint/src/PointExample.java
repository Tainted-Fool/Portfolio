
public class PointExample 
{
	public static void main(String[] args) 
	{
		Point p1 = new Point(3, 5);
		Point p2 = new Point();
		//p1.x = 3;
		//p1.y = 5;
		p1.translate(3, 5);
		System.out.println("(" + p1.getX() + ", " + p1.getY() + ")");
		System.out.println("It is " + p1.distanceFromOrigin() + " from (0, 0)");
		System.out.println(p1.toString());
		System.out.println(p2);
	}
}
