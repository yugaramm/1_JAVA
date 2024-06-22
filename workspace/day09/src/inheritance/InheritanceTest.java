package inheritance;

class Human{
	String name;
	int age;
	char gender;
	
	//기본 생성자
	//부모의 기본 생성자가 없다면 자식에서 부모의 생성자를 꼭 호출 해줘야한다.
	public Human() {;}
	
	//이름만 초기화 해주는 생성자
	public Human(String name) {
		this.name = name;
	}
	
	public Human(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "살");
		System.out.println("성별 : " + (gender == 'M' ? "남자" : "여자"));
	}
}

class Student extends Human{
	char grade;
	
	Student(){;}

	Student(String name, int age, char gender, char grade) {
		//super() : 부모 생성자
		super(name, age, gender); // 항상 부모 생성자가 먼저 호출이 되어야한다.
		this.grade = grade;
	}
	
	void printGrade() {
		System.out.println("성적 : " + grade + "학점");
	}
	
}


public class InheritanceTest {
	public static void main(String[] args) {
		Human yu = new Human("유가람", 25, 'W');
		yu.printInfo();
		
		//자식 타입으로 객체를 만든다면, 부모 생성자는 자동으로 실행된다.
		//자식 생성자 내부에 부모의 기본 생성자가 항상 생략되어 있다.
		
		//부모의 기본 생성자가 있을 때 테스트
		//부모 생성자가 무조건 먼저 호출 된다는 것 확인!
		Student stu = new Student();
		
		//부모의 멤버변수 사용 가능
		stu.name = "유가람";
		stu.grade = 'A';
		
		//부모의 메소드 사용 가능!
		stu.printInfo();
		//자식만 가지고있는 메소드 사용 가능!
		stu.printGrade();
		
		
	}

}
