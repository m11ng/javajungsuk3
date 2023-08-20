package ch06;
// Tv클래스를 주어진 로직대로 완성하시오.
// 완성한 후에 실행해서 주어진 실행 결과와 일치하는지 확인하라.
class MyTv {
	boolean isPowerOn; // false
	int channel;
	int volume;
	
	final int MAX_VOLUME  = 100;
	final int MIN_VOLUME  = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	// isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
	void turnOnOff() {
		isPowerOn = !isPowerOn;
	}
	
	void volumeUp() {
		// 볼륨의 값이 max_volume보다 작을 떄만 값을 1증가 시킨다.
		if(volume<MAX_VOLUME) {
			++volume;
		}
	}

	void volumeDown() {
		// 볼륨의 값이 min_volume보다 클떄만 값을 1감소 시킨다.
		if(volume>MIN_VOLUME) {
			--volume;
		}
	}
	void channelUp() {
		// channel의 값을 1증가 시킨다.
		// 만일 channel이 max_channel이면 , channel의 값을 MIN_channal로 바꾼다.
		++channel;
		if(channel > MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}
	}
	
	void channelDown() {
		// channel의 값을 1감소 시킨다.
		// 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
		--channel;
		if(channel < MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}
	}
}

class MyTvTest {
	public static void main(String[] args) {
		MyTv t = new MyTv();
		t.channel = 100;
		t.volume = 0;

		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:"+t.channel+", VOL:"+t.volume); //
		
		t.volume=100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
	}
	
}