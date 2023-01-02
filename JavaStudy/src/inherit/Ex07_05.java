package inherit;
//문제 49p ~
//해설 263p ~
class product {
	int price;
	int bonusPoint;
	
	//tv 객체를 생성할 때, 생성자 tv()가 호출되고 super() - product()를 호출함
	public product() {
	}
	
	public product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class tv extends product {
	public tv() {
	}
	
	public String toString() {
		return "tv";
	}
}

public class Ex07_05 {
	public static void main(String[] args) {
		tv t = new tv();
	}
}