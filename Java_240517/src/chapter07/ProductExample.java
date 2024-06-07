package chapter07;

public class ProductExample {
	public static void main(String[] args) {
		
		Product<Tv, String> product1 = new Product<Tv, String>();
		
		product1.setKind(new Tv());
		product1.setModel("스마트TV");
		
		Tv tv = product1.getKind(); // new Tv()
		System.out.println(tv);
		String model = product1.getModel(); // "스마트TV"
		System.out.println(model);
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		
		Car car = product2.getKind(); // new Car()
		System.out.println(car);
		String carModel = product2.getModel(); // "디젤"
		System.out.println(carModel);
	}
}
