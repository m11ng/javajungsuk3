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
	// ���� ä�η� �̵��ϴ� ����� �޼��� �߰��ϱ�.
	// Exercise7_11 ���� ä���� ���� ������ ��������� �����϶�.
	int pre = 0;
	void gotoPrevChannel() {
		if(!(channel==0)) {
			
		}
		pre = this.channel; // ����ä��
		// ���� ä�� : setChannel
		
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
