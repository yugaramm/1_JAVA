package util;

import java.sql.Connection;
import java.util.List;

import dao.UserDAO;
import dto.UserDTO;
import vo.UserVO;

public class Test {
	public static void main(String[] args) {
		
		UserDAO userDAO = new UserDAO();
		
		List<UserVO> userList = userDAO.selectAll();
		
		System.out.println(userList);
		
//		회원가입 insert() 테스트
//		String name = "garam";
//		
//		if(userDAO.checkId(name)) {
//			UserVO userVO = new UserVO(0, name, "4567", "홍길동", "010-4567-1234", "2000-04-03", 1);
//			userDAO.insert(userVO);
//			
//		}
//		else {
//			System.out.println("중복확인하세요");
//		}
//		
//		userList = userDAO.selectAll();
//		System.out.println(userList);
		
//		update() 테스트
//		userDAO.update(new UserVO(3, "garam", "4567", "홍길동", "010-2468-1234", "1997-04-03", 0));
		
//		update() 2번째 테스트
//		userDAO.update("010-2468-1234", "7890");
//		
//		userList = userDAO.selectAll();
//		System.out.println(userList);
		
//		delete() 테스트
//		userDAO.delete(2);
//		
//		userList = userDAO.selectAll();
//		System.out.println(userList);
		
//		selectOne() 테스트
		System.out.println(userDAO.selectOne(3));
		
		UserDTO user = userDAO.userInfo(21);
		System.out.println(user);
		
		System.out.println(userDAO.countRecommender(1));
		
		
	}
}
