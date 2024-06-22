package joinTest;

import java.util.Scanner;

// 프로그램 관리 클래스
public class UserController {
	
	private final Scanner sc = new Scanner(System.in);
	private UserService us = new UserService();
	private String loginId = null;
	
	public UserController() {
		play();
	}
	
	
	private void play() {
		System.out.println("☆★☆★☆★☆★☆★커뮤니티에 오신 걸 환영합니다!☆★☆★☆★☆★☆★");
		
		while(true) {
			System.out.println("1. 회원가입\n2. 로그인\n3. 종료");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: // 회원가입
				join();
				break;
			case 2: // 로그인
				login();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("번호 확인!");
			}
		}
	}
	
	
	private void join() {
		String id = null;
		String pw = null;
		String name = null;
		
		while(true) { // 중복되는 친구가 없을 때 까지 계속 입력!
			System.out.println("q <- 뒤로가기");
			System.out.print("id : ");
			id = sc.next();
			
			if(id.equals("q")) {
				System.out.println("이전 화면으로~");
				return;
			}
			
			if(us.checkId(id) == null) {
				break;
			}
			else {
				System.out.println("이미 중복되는 아이디가 있습니다.");
			}
		}
		
		System.out.print("pw : ");
		pw = sc.next();
		System.out.print("name : ");
		name = sc.next();
		
		us.join(new User(id, pw, name));
		System.out.println("☆☆☆☆☆ 회원가입완료 ☆☆☆☆☆");
	}
	
	private void login() {
		String id = null;
		String pw = null;
		
		while(loginId == null) {
			System.out.println("q <- 뒤로가기");
			System.out.print("id : ");
			
			id = sc.next();
			
			if(id.equals("q")) {
				System.out.println("이전 화면으로~");
				return;
			}
			
			
			System.out.println("q <- 뒤로가기");
			System.out.print("pw : ");
			
			pw = sc.next();
			
			if(id.equals("q")) {
				System.out.println("이전 화면으로~");
				return;
			}
			
			loginId = us.login(id, pw);
			if(loginId == null) {
				System.out.println("아이디 비밀번호를 확인하세요.");
			}
		}
		System.out.println(us.checkId(loginId).getName() + "님 환영합니다.");
		moveMyPage();
	}
	
	private void moveMyPage() {
		
		while(true) {
			System.out.println("1. 마이페이지\n2. 이름 변경\n3. 로그아웃");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: // 마이페이지
				us.printData(us.checkId(loginId));
				break;
			case 2: // 이름 변경
				changeName();
				break;
			case 3: // 로그아웃
				System.out.println(us.checkId(loginId).getName() + "님 안녕히가세요.");
				return;
			default:
				System.out.println("번호를 확인하세요!");
				break;
			}
		}
		
	}
	
	private void changeName() {
		String newName = null;
		
		System.out.print("new Name : ");
		newName = sc.next();
		
		us.changeName(loginId, newName);
	}
	
}
