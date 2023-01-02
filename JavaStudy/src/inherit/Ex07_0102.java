package inherit;
//문제 46p ~
//해설 255p ~
class sutdaDeck {
	final int card_num = 20;
	sutdaCard[] cards = new sutdaCard[card_num];

	sutdaDeck() {
		for(int i = 0; i < cards.length; i++) {
			int index = i % 10 + 1;
			boolean isKwang = (i < 10) && 
							  (index == 1 || index == 3 || index == 8);
			cards[i] = new sutdaCard(index, isKwang);
		}
	}
	
	void shuffle() {
		sutdaCard temp = null;
		for(int i = 0; i < cards.length; i++) {
			int ran = (int)(Math.random() * 20);
			temp = cards[i];
			cards[i] = cards[ran];
			cards[ran] = temp;
		}
	}
	
	sutdaCard pick(int index) {
		if(index < 0 || index >= card_num) return null;
		return cards[index];
	}
	
	sutdaCard pick() {
		int ran = (int)(Math.random() * 20);
		return pick(ran);
	}
}

class sutdaCard {
	int num;
	boolean isKwang;

	sutdaCard() {
		this(1, true);
	}

	sutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Ex07_0102 {
	public static void main(String[] args) {
		sutdaDeck deck = new sutdaDeck();
		for(int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ", ");
		}
		System.out.println();
		
		deck.shuffle();
		for(int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ", ");
		}
		System.out.println();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
	}
}
