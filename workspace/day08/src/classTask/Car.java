package classTask;

public class Car {
	String name;
	int pw;
	boolean door;
	boolean engine;
	
	public Car(String name, int pw) {
		this.name = name;
		this.pw = pw;
	}
	
	boolean openDoor(int pw) {
		if(this.pw == pw) {
			door = true;
			return true;
		}
		return false;
	} // 문 열기 끝
	
	void closeDoor() {
		door = false;
	} // 문 닫기 끝
	
	
	void engineStart() {
		engine = true;
	}
	
	void engineStop() {
		engine = false;
	}

}
