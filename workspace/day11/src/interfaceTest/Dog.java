package interfaceTest;

public class Dog implements Animal {

   @Override
   public void eat() {
      System.out.println("아주 맛있게 먹는다.");
   }

   @Override
   public void breath() {
      System.out.println("맛있게 숨을 들이마신다.");
   }

   // 바디를 만든 것 만으로, 구현을 한 것이라고 판단!
   @Override
   public void bark() {
      // TODO Auto-generated method stub
      
   }

   @Override
   public void bite() {
      // TODO Auto-generated method stub
      
   }

   @Override
   public void waitNow() {
      // TODO Auto-generated method stub
      
   }
   
   
   public static void main(String[] args) {
      Dog dog = new Dog();

      System.out.println(dog instanceof Animal);
      
   }
}
