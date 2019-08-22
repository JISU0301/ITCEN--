package ex01;

public class Buyer {
	private int count; //갯수
	private int money; //돈

	//생성자
	public Buyer(int count, int money) { 
		System.out.println("구매자 생성자 호출 ~ ");
		setCount(count);
		setMoney(money);

		//현황 출력하기 생성자에서 this 호출하면 toString 메소드 호출됨
		// toString Override 되어있지 않으면 객체 메모리 주소 호출됨
		System.out.println(this); 

	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	/**
	 * 지불하기
	 * 구매자가 가진 돈에서 지불할 금액을 뺀다. 
	 * @param money : 지불할 금액
	 */
	public void pay(int money) {
		this.money -= money;
	}
	
	public void buy(Seller seller) {
		seller.sell(this);

		this.count++;

	}
	
	public String toString() {
		String str = String.format("구매한 상품 갯수 : %d\n 구매자가 가진 금액 : %d\n",
				this.count, this.money);
		return str;
	}



}
