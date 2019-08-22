package ex01;

public class Seller {

	private final int sellprice = 2500;
	private int sellermoney;
	private int goodscount;
	
	public Seller(int goodscount, int sellermoney) {
		System.out.println("판매자 생성자 호출 ~ ");
		
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
		this.goodscount--; //판매자가 가진 상품 갯수 --
		
		buyer.pay(sellprice);
		
		this.sellermoney += sellprice; //판매자가 가진 돈에서 
									//상품가격만큼 더한다.
		
	}
	
	/**
	 * 재고 파악하기
	 * @return : boolean 재고가 있으면 false, 재고가 없으면 true
	 */
	public boolean isSoldOut() {
		boolean isSoldOut = this.goodscount==0;
		return isSoldOut;
		
	}
	
	public String toString() {
		String str = String.format("판매자의 상품 갯수 : %d\n 판매자가 가진 금액 : %d",
				this.goodscount, this.sellermoney);
		return str;
	}

	}


