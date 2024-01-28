package codingtest.ct.week01;

public interface RemoteControl {
	public static final  int MAX_VOLUME = 10;
	int MIN_VOLUE = 0;
	public void turnOn();// 인터페이스에서 메소드는 구현x
	public void setVolume(int volume); 
	public void turnOff();

}
