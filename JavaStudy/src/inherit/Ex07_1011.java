package inherit;
//문제 51p ~
//해설 269p ~
class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		prevChannel = this.channel;
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	void gotoPrevChannel() {
		setChannel(prevChannel);
	}
}

public class Ex07_1011 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("Ch : " + t.getChannel());
		t.setChannel(20);
		System.out.println("Ch : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("Ch : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("Ch : " + t.getChannel());
	}
}
