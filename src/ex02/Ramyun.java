package ex02;

public class Ramyun {
	  public static void main (String[] args) {
	    ramyunProcessing();
	  }
	  public static void ramyunProcessing() {
	    /* 라면을 먹기까지의 과정이 출력하되도록 */
	    /* 주어진 메소드들을 호출하시오 */
		  buy();
		  boil();
		  put();
		  eat();
	  }
	  public static void eat() {
	    System.out.println("맛있게 먹는다.");
	  }
	  public static void put() {
	    System.out.println("라면을 넣는다.");
	  }
	  public static void buy() {
	    System.out.println("라면을 산다.");
	  }
	  public static void boil() {
	    System.out.println("물을 끓인다.");
	  }
	}