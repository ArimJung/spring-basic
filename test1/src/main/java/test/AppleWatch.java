package test;

public class AppleWatch implements Watch{
	public AppleWatch() {
		System.out.println("애플워치 객체생성완료");
	}

	@Override
	public void powerOn() {
		System.out.println("애플워치 전원 ON");
	}
	@Override
	public void powerOff() {
		System.out.println("애플워치 전원 OFF");
	}


}
