package codingtest.ct.week01;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc = new Radio();
		// 인터페이스는 공유기라 보면 됨 -> 텔레비전 , 라디오 인터페이스 받은거 다 쓸 수 있음
		rc.turnOff();
		
	}
}
