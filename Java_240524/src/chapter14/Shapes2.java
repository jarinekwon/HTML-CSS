package chapter14;


interface Shape2 {
	
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print(".... 다시 그립니다. ");
		draw();
	}
}

class Circle2 implements Shape2 {

	private int r;
	private double a, b;
	private int c, d;

	public Circle2(int r) {
		this.r = r;
	}

	@Override
	public void draw() {
		System.out.println("반지름이 " + r + "인 원입니다.");
	}

	@Override
	public double getArea() {
		return r * r * PI;
	}
}

class Oval implements Shape2 {

	
	private int a, b;
	

	public Oval(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void draw() {
		System.out.println(a + "x" + b + "에 내접하는 타원입니다.");
	}

	@Override
	public double getArea() {
		return a * 0.5 * b * 0.5 * PI;
	}
}

class Rect implements Shape2 {

	private int c;
	private int d;

	public Rect(int c, int d) {
		this.c = c;
		this.d = d;
	}

	@Override
	public void draw() {
		System.out.println(c + "x" + d + "크기의 사각형 입니다.");
	}

	@Override
	public double getArea() {
		return c * d;
	}
}


public class Shapes2 {
	public static void main(String[] args) {
		
		Shape2[] list = new Shape2[3];
		list[0] = new Circle2(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect(10, 40);
		
		for (int i = 0; i < list.length; i++) {
			list[i].redraw();
		}
		for (int i = 0; i < list.length; i++) {
			System.out.println("면적은 " + list[i].getArea());
		}
	}
}










