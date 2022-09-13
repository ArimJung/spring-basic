package test;

public class GalaxyWatch implements Watch{
	public GalaxyWatch(){
		System.out.println("갤럭시 워치 객체생성완료");
	}
	@Override
	public void powerOn() {
		System.out.println("갤럭시워치 전원 ON");
	}
	@Override
	public void powerOff() {
		System.out.println("갤럭시워치 전원 OFF");
	}


}
