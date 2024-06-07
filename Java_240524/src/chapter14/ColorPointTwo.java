package chapter14;

class PointTwo {
	
	private int x, y;
	
	public PointTwo(int x, int y) {this.x = x; this.y = y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x = x; this.y = y;}

}

public class ColorPointTwo extends PointTwo {
	private String color;
	
	public ColorPointTwo(int x, int y) {
		super(x, y);

	}
	public ColorPointTwo(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void setXY(int x, int y) {
		move(x, y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return color + "색의 (" + getX() + "," + getY() + ")의 점";
	}
	
	public static void main(String[] args) {
		
		
		ColorPointTwo zeroPoint = new ColorPointTwo(0,0,"BLACK");
		System.out.println(zeroPoint.toString() + "입니다.");
		
		
		ColorPointTwo cp = new ColorPointTwo(10, 10);
		cp.setXY(5,5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}
}
