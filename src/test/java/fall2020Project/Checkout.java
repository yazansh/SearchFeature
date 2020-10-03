package fall2020Project;

public class Checkout {
private int total;
	public int total(int totb, int tota) {
		// TODO Auto-generated method stub
		total=tota+totb;
		System.out.print("the total price is ");
		System.out.println(total);
		return total;
	}
	/*public void add(int itemCount, int price) {
		// TODO Auto-generated method stub
		
	}*/
	public int totalapple(int itemCount, int price) {
		// TODO Auto-generated method stub
		int tot=itemCount*price;
		return tot;
	}
	public int totalbanana(int itemCount, int price) {
		// TODO Auto-generated method stub
		
		int totb=itemCount*price;
		return totb;
	}

}
                                                                                                                                                                                     