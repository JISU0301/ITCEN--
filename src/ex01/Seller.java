package ex01;

public class Seller {

	private final int sellprice = 2500;
	private int sellermoney;
	private int goodscount;
	
	public Seller(int goodscount, int sellermoney) {
		System.out.println("�Ǹ��� ������ ȣ�� ~ ");
		
		setGoodscount(goodscount);
		setSellermoney(sellermoney);
	}

	public int getSellermoney() {
		return sellermoney;
	}

	public void setSellermoney(int sellermoney) {
		this.sellermoney = sellermoney;
	}

	public int getGoodscount() {
		return goodscount;
	}

	public void setGoodscount(int goodscount) {
		this.goodscount = goodscount;
	}

	public int getSellprice() {
		return sellprice;
	}
	
	public void sell(Buyer buyer) {
		this.goodscount--; //�Ǹ��ڰ� ���� ��ǰ ���� --
		
		buyer.pay(sellprice);
		
		this.sellermoney += sellprice; //�Ǹ��ڰ� ���� ������ 
									//��ǰ���ݸ�ŭ ���Ѵ�.
		
	}
	
	/**
	 * ��� �ľ��ϱ�
	 * @return : boolean ��� ������ false, ��� ������ true
	 */
	public boolean isSoldOut() {
		boolean isSoldOut = this.goodscount==0;
		return isSoldOut;
		
	}
	
	public String toString() {
		String str = String.format("�Ǹ����� ��ǰ ���� : %d\n �Ǹ��ڰ� ���� �ݾ� : %d",
				this.goodscount, this.sellermoney);
		return str;
	}

	}


