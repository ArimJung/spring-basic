package test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		// Spring 컨테이너를 동작시킬수 있도록 코드 작성
		AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext.xml");
		// Spring 컨테이너야, 나 폰 객체 가지고 싶어!
		// == Lookup
		Phone phone = (Phone)factory.getBean("iphone");
		phone.powerOn();
		phone.powerOff();
		phone.volumeUp();
		phone.volumeDown();
		factory.close();
		/*
		BeanFactory bf=new BeanFactory();
		Phone phone=(Phone)bf.getBean(args[0]);
			phone.powerOn();
			phone.powerOff();
			phone.volumeUp();
			phone.volumeDown();
		*/
	
	}
}
