package castingTask;

public class Test {
	//메소드를 하나 만들겁니다
	//애니메이션, 영화, 드라마 클래스 선언
	//사용자가 선택한 영상이
	//애니메이션이라면 "자막지원" 출력하는 메소드 실행
	//영화라면 "4D 지원" 출력하는 메소드 실행
	//드라마라면 "굿즈 구매" 출력하는 메소드 실행
	
	public void check(OTT ott) {
		if(ott instanceof Animation) {
			((Animation) ott).supportSub();
		}
		else if(ott instanceof Movie) {
			((Movie) ott).support4D();
		}
		else {
			Drama drama = (Drama)ott;
	        drama.moveMarket();
	      }
	}
	
	
	public static void main(String[] args) {
		Test t = new Test();
		
		t.check(new Animation());
		t.check(new Movie());
		t.check(new Drama());
		
		
		
	}
}
