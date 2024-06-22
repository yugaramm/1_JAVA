package interfaceTest;

public abstract class AnimalAdapter implements Animal{
	
	@Override
	public void eat() {;}
	
	
	@Override
	public void breath() {;}
	
	
	@Override
	public void bark() {;}
	
	
	@Override
	public void bite() {;}
	
	@Override
	public void waitNow() {;}
	
	public static void main(String[] args) {
		Snake ana = new Snake();
		System.out.println(ana instanceof Animal);
	}

}
