package ex02;

public class Ramyun {
	  public static void main (String[] args) {
	    ramyunProcessing();
	  }
	  public static void ramyunProcessing() {
	    /* ����� �Ա������ ������ ����ϵǵ��� */
	    /* �־��� �޼ҵ���� ȣ���Ͻÿ� */
		  buy();
		  boil();
		  put();
		  eat();
	  }
	  public static void eat() {
	    System.out.println("���ְ� �Դ´�.");
	  }
	  public static void put() {
	    System.out.println("����� �ִ´�.");
	  }
	  public static void buy() {
	    System.out.println("����� ���.");
	  }
	  public static void boil() {
	    System.out.println("���� ���δ�.");
	  }
	}