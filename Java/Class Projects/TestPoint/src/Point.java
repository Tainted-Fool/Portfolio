
public class Point 
{
	private int x;
	private int y;
	
	public Point (int newX, int newY) //Constructor
	{
		x = newX;
		y = newY;
	}
	
	public Point()
	{
		x = -1;
		y = -1;
	}
	
	public Point(Point newP)
	{
		x = newP.x;
		y = newP.y;
	}
	
	public void translate (int dx, int dy)
	{
		int x = 0;
		this.x += dx;
		this.y += dy;
	}
	
	public int getX() //Can be rewritten as { return x; } for readability
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public double distanceFromOrigin()
	{
		return Math.sqrt(x * x + y * y);
	}
	
	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}
}
