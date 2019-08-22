package ex01;

public class Buyer {
	private int count; //����
	private int money; //��

	//������
	public Buyer(int count, int money) { 
		System.out.println("������ ������ ȣ�� ~ ");
		setCount(count);
		setMoney(money);

		//��Ȳ ����ϱ� �����ڿ��� this ȣ���ϸ� toString �޼ҵ� ȣ���
		// toString Override �Ǿ����� ������ ��ü �޸� �ּ� ȣ���
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
	 * �����ϱ�
	 * �����ڰ� ���� ������ ������ �ݾ��� ����. 
	 * @param money : ������ �ݾ�
	 */
	public void pay(int money) {
		this.money -= money;
	}
	
	public void buy(Seller seller) {
		seller.sell(this);

		this.count++;

	}
	
	public String toString() {
		String str = String.format("������ ��ǰ ���� : %d\n �����ڰ� ���� �ݾ� : %d\n",
				this.count, this.money);
		return str;
	}



}
