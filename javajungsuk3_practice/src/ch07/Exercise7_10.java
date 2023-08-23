package ch07;

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public int getChannel() {return channel;}
	public int getVolume()  {return volume;}
	public void setChannel(int channel) {
		if(MIN_CHANNEL>channel || channel>MAX_CHANNEL) {return;}
		this.channel=channel;
	}
	public void setVolume(int volume) {
		if(MIN_VOLUME> volume || volume>MAX_VOLUME) {return;}
		this.volume = volume;
	}
	// 이전 채널로 이동하는 기능의 메서드 추가하기.
	// Exercise7_11 이전 채널의 값을 저장할 멤버변수를 정의하라.
	int pre = 0;
	void gotoPrevChannel() {
		if(!(channel==0)) {
			
		}
		pre = this.channel; // 이전채널
		// 현재 채널 : setChannel
		
		// this.channel..........
		
	}



}
class Exercise7_10 {

	public static void main(String[] args) {

		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH: "+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL: "+t.getVolume());
		
		t.gotoPrevChannel();
		System.out.println("CH: "+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH: "+t.getChannel());
	}

}
