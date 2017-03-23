
public class Ball 
{
	private double size;
	private int x;
	private int y;
	private int z;
	private String color;

	public Ball() //No arguments
	{
		size = 0.0;
		x = 0;
		y = 0;
		z = 0;
		color = "white";
	}
	
	/*public Ball(Ball copy) // Don't really know what this does
	{
		this.size = copy.size;
		this.x = copy.x;
		this.y = copy.y;
		this.z = copy.z;
		this.color = copy.color;
	}*/
	
	public Ball(double newSize, int newX, int newY, int newZ, String newColor)
	{
		this.size = newSize;
		this.x = newX;
		this.y = newY;
		this.z = newZ;
		this.color = newColor;
	}
	
	public double getSize() { return this.size; }
	public int getX() { return this.x; }
	public int getY() { return this.y; }
	public int getZ() { return this.z; }
	public String getColor() { return this.color; }
	
	public void moveTo(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String toString()
	{
		return "A " + this.color + " ball that is " + this.size + " across is at " 
				+ "(" + this.x + ", " + this.y + ", " + this.z + ") location";
	}
	
	public double volume()
	{
		return (4.0 / 3.0) * Math.PI * (this.size / 2) * (this.size / 2)
				* (this.size / 2);
	}
	
	public static void main (String[] args)
	{
		Ball b = new Ball(20, 5, 9, 11, "red");
		System.out.println(b);
		System.out.println(b.volume());
	}
}
