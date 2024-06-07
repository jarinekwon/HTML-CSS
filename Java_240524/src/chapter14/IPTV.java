package chapter14;

public class IPTV extends ColorTV {
	
	private String ip;
	public IPTV(String ip, int size, int nColors) {
		super(size, nColors);
		this.ip = ip;
	}
	
	public void printProperty() {
		System.out.println("나의 IPTV는 " + ip + " 주소의 " + getSize() + "인치 " + getnColors() + "컬러");

	}

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32 ,2048);
		iptv.printProperty();
	}
}
