package Chapter7;

public class Exercise7_19 {
	public static void main(String args[]) {
		Buyer_ b = new Buyer_();
		b.buy(new Tv_19());
		b.buy(new Computer_19());
		b.buy(new Tv_19());
		b.buy(new Audio_19());
		b.buy(new Computer_19());
		b.buy(new Computer_19());
		b.buy(new Computer_19());
		
		b.summary();
	}
}

class Buyer_ {
	int money = 1000;
	Product_[] cart = new Product_[3];
	int i = 0;
	
	void buy(Product_ p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 "+p+"을/를 살 수 없슶니다.");
			return;
		}
		else {
			money -= p.price;
			add(p);
		}
	}
	
	void add(Product_ p) {
		if(i >= cart.length) {
			Product_[] newcart = new Product_[cart.length*2];
			System.arraycopy(cart, 0, newcart, 0, cart.length);
			cart = newcart;
		}
		cart[i] = p;
		i++;
	}
	
	void summary() {
		String itemlist = "";
		int sum = 0;
		
		for(int j=0;j<cart.length;j++) {
			if(cart[j] == null)
				break;
			itemlist += cart[j] + ",";
			sum += cart[j].price;
		}
		System.out.println("구입한 물건 : "+itemlist);
		System.out.println("사용한 금액 : "+sum);
		System.out.println("남은 금액 : "+money);
	}
}

class Product_ {
	int price;
	Product_(int price) {
		this.price = price;
	}
}

class Tv_19 extends Product_ {
	Tv_19() { super(100); }
	public String toString() { return "Tv"; }
}
class Computer_19 extends Product_ {
	Computer_19() { super(200); }
	public String toString() { return "Computer"; }
}

class Audio_19 extends Product_ {
	Audio_19() { super(50); }
	public String toString() { return "Audio"; }
}