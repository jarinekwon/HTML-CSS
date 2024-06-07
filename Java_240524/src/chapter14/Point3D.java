package chapter14;

class PointThree {
	
	protected int x;
	protected int y;
	protected int z;
	
	public PointThree(int x, int y, int z) {this.x = x; this.y = y; this.z = z;}
	public int getX() {return x;}
	public int getY() {return y;}
	public int getZ() {return z;}
	protected void moveXY(int x, int y) {this.x = x; this.y = y;}
	protected void moveXYZ(int x, int y, int z) {this.x = x; this.y = y; this.z = z;}
	protected void movedownZ(int z) {this.z = -z;}
}

public class Point3D extends PointThree {
	
	
	public Point3D(int x, int y, int z) {
		super(x, y, z);
	}
	
	public void move(int x, int y) {
		moveXY(x,y);
	}
	public void move(int x, int y, int z) {
		moveXYZ(x, y, z);
	}
	public void moveUp() {
		z += 1;
	}
	public void moveDown() {
		z -= 1;
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y + "," + z + ")의 점";
	}
	
	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp();
		System.out.println(p.toString() + "입니다.");
				
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(100, 200, 300);
		System.out.println(p.toString() + "입니다.");
	
	}
}
