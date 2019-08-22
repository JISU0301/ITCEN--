package ex01;

public class Mart {
	
	public void start() {
		Buyer jisu = new Buyer(0,50000);
		Seller som = new Seller(500,50000);
		
		jisu.buy(som);
		
		System.out.println(jisu);
		System.out.println(som);
	}

	public static void main(String[] args) {
		
		new Mart().start();

	}

}
