package day19;

public class practice {
	public int[] solution(int start, int end_num) {
        int[] answer = {};
        for (int i = start; i < end_num; i--) {
			answer[i] = i;
		}
        return answer;
    }
}
