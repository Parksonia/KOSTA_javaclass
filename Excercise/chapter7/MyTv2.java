package chapter7;

public class MyTv2 {
	
	private boolean isPowerOn;  // 다른 클래스,패키지에서 사용 불가 
	private int channel;
	private int volume;
	private int preChannel;
	
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	public void setChannel(int channel) { // 데이터를 넣어주기만 하니까 void, channel 바꿔주는거니까 인자로 받음
		this.preChannel = this.channel;
		this.channel = channel; // 여기서 가리키는  this 는 t
	}
	
	public int getChannel() {
		return channel;
	}

	public boolean isPowerOn() {
		return isPowerOn;
	}

	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int getPreChannel() {
		return preChannel;
	}

	public void setPreChannel(int preChannel) {
		this.preChannel = preChannel;
	}
	
	public void gotoPrevChannel() {  //채널 이동할때마다 이전채널을 setChannel에서 이전 채널을 저장해두고 있어야함 
		int tempChannel = this.channel; // 현재 채널을 저장하고 
		this.channel = this.preChannel; // 이전 채널을 불러오고
		this.preChannel = tempChannel; // 현재 채널에 지금 채널을 저장해두기 
	}
	
	
}
