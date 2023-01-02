package inherit;
//문제 50p ~
//해설 265p ~
class Parent {
	int x = 100;
	
	public Parent() {
		this(200);
		System.out.println("2");
	}
	
	Parent(int x) {
		this.x = x;
		System.out.println("1");
	}
	
	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;
	
	public Child() {
		this(1000);
		System.out.println("4");
	}
	
	Child(int x) {
		this.x = x;
		System.out.println("3");
	}
}

public class Ex07_07 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x = " + c.getX()); // x = 200
	}
}
