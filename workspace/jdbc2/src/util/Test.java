package util;

import java.sql.Connection;
import java.util.List;

import menu.MenuDTO;
import menu.MenuVO;

public class Test {
	public static void main(String[] args) {
	
		Connection connection = DBConnection.getConnection();
		
//		menuDAO -> selectAll() 테스트
		menu.dao.MenuDAO MD = new menu.dao.MenuDAO();
		
		List<MenuDTO> list =  MD.selectAll();
		System.out.println(list);

//		insert() 테스트
		if(MD.insert(new MenuVO(4, "녹차프라푸치노", 5500)) == 1) {
			System.out.println("추가 성공");
		}
		list = MD.selectAll();
		System.out.println(list);
		
//		update() 테스트
//		System.out.println(MD.update(new MenuVO(4, "녹차프라푸치노", 5500)) + "행 변경");
//		list = MD.selectAll();
//		System.out.println(list);
		
//		delete() 테스트
//		System.out.println(MD.delete(4));
//		list = MD.selectAll();
//		System.out.println(list);
	}
}
