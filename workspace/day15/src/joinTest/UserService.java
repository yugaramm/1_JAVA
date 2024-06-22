package joinTest;

import java.util.ArrayList;
import java.util.List;

public class UserService {
	
	public static List<User> userList = new ArrayList<>();
	
	
	// id 중복검사.
	// 리턴 타입을 User
	public User checkId(String id) {
		for (User user : userList) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	
	// 회원가입
	public void join(User user) {
		userList.add(user);
	}
	
	// 로그인
	// 매개변수 : id, pw
	public String login(String id, String pw) {
		User loginUser = checkId(id); 
		if(loginUser != null) {
			if(loginUser.getPw().equals(pw)) {
				return loginUser.getId();
			}
		}
		return null;
	}
	
	// 내 정보 보기
	public void printData(User user) {
		System.out.println("id : " + user.getId());
		System.out.println("name : " + user.getName());
	}
	
	// 이름 변경
	public void changeName(String loginId, String newName) {
		checkId(loginId).setName(newName);
	}
	
		
	
}
