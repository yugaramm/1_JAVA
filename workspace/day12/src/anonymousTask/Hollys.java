package anonymousTask;

public class Hollys { // 본사
   
   // 양식을 검사하는 메소드.
   public void register(Form form) {
      
      String[] menus = form.getMenu();
      
      System.out.println("----- 메뉴 -----");
      
      for (int i = 0; i < menus.length; i++) {
         System.out.println(i + 1 + ". " + menus[i]);
      }
      
      if(form instanceof FormAdapter) {
         System.out.println("무료 나눔 행사 진행중");
      }
      else {
         form.sell("요거트");
      }
      
   }
   
}



