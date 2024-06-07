package chapter07;

public class Product<T, M> { // T=Tv, M=String
	
	private T kind;
	private M model;
	// T=Tv, M=String
	// 3. Tv kind = new Tv()
	// 3. String Model = "스마트TV"
	
	public T getKind() {
		return kind;
	}
	// T=Tv가 메소드의 리턴타입
	public void setKind(T kind) {
		this.kind = kind; // 2. Tv kind = new Tv()
	}
	// T=Tv가 매개변수의 타입
	// 1. Tv kind = new Tv()
	public M getModel() {
		return model;
	}
	// M=String이 메소드의 리턴타입
	public void setModel(M model) {
		this.model = model;	// 2. String Model = "스마트TV"
	}
	// M=String이 매개변수의 타입
	// 1. String Model = "스마트TV"
	
}
