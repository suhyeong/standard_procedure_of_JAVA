package Chapter7;

class MyTv7 {
	boolean isPowerOn;
	int channel;
	int volume;
	//7-11
	private int prevChannel; //이전채널
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
			return;
		prevChannel = this.channel;
		this.channel = channel;
	}
	
	int getChannel() {
		return channel;
	}
	
	void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME)
			return;
		this.volume = volume;
	}
	
	int getVolume() {
		return volume;
	}
	
	
	//7-11
	void gotoPrevChannel() {
		setChannel(prevChannel);
	}
}

public class Exercise7_10 {
	public static void main(String args[]) {
		MyTv7 t = new MyTv7();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume());
		
		//7-11
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
	}
}
