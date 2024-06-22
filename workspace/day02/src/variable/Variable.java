package variable;

public class Variable {
		public static void main(String[] args) {
			//변수의 선언
			int number;
			//변수의 초기화	
			number = 49;
			
			//변수의 사용
			System.out.println(number);
			
			//변수의 값과 저장공간의 차이
			//변수명 앞에 자료형 또는 변수명 뒤에 대입연산자가 온다면 저장공간
			//나머지는 저장된 값 그 자체
			int data = 111; // 저장공간
			number = data + 172; // number는 저장공간, data는 값
			
		}

}
