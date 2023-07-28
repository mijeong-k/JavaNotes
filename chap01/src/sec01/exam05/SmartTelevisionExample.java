package sec01.exam05;

import sec01.exam04.RemoteControl;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn();
		tv.setVolume(6);
		tv.search("www.naver.com");
		tv.turnOff();
		
		RemoteControl rc = tv;
		rc.turnOn();
		rc.setVolume(8);
		rc.turnOff();
		
		Searchable searchable = tv;
		//The method setVolume(int) is undefined for the type Searchable
//		searchable.setVolume(7);
		searchable.search("www.google.com");		

	}
}
