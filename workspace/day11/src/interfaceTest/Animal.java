package interfaceTest;

public interface Animal {//상수와 추상 메소드만 존재할 수 있다.
	
	//추상메소드가 구현이 되기 전에는 메모리에 올릴 수 없기 때문에
	//우리가 상수를 사용하기 위해서는 static을 붙여주는 방법 밖에 없다.
	final static int EYES = 2;
	
	int MOUTH = 1;
	
	//일반 메소드는 존재할 수 없다.
	public abstract void eat();
	
	//추상 메소드만! 가질 수 있는 interface의 특성상 추상메소드와 일반메소드를 구분하지 않아도 된다.
	public void breath();
	
	public void bark();
	public void bite();
	public void waitNow();
	
	
	
	
	
}
