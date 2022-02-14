package teamNew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FunctionalDevelopment {

   public static int[] solution(int[] progresses, int[] speeds) {
	   
	        int[] answerArr = null;
	        int count = 0;
	        int num = 0;
	        int index = 0;
	        Queue<Integer> queue = new LinkedList<>();
	        ArrayList<Integer> answer = new ArrayList<Integer>();
	        
	        for (int i = 0 ; i < progresses.length; i++) {
	        	queue.add(progresses[i]);
	        } // 모든 값을 queue 에 넣음 
	        while (!queue.isEmpty()) { // queue 가 빌 때 까지 
	        	if (queue.peek() + (num * speeds[index]) >= 100) { // queue 의 첫번째 값 + while 문을 돈 횟수 * speed  >= 100? 
	        	//	System.out.println(queue);
	        		queue.poll();  //넘는다면 queue 의 맨 위 값을 삭제 
	        		index++; // speeds 를 위한 인덱스 추가 
	        		count++; // 100 이 넘어서 지워준 queue 의 횟수를 카운트 
	        		if (queue.isEmpty()) {answer.add(count);} // 마지막 queue 를 없앴다면 
	        	}
	        	else if (count != 0) { 
	        		// count 가 0 이 아니고(지금 queue 이전에 지워준 queue 가 존재 / 현재 peek 이 100 이 넘지 않으면 count를 어레이리스트에 추가) 
	        		answer.add(count);
	        		count = 0;	// 카운트 초기화 
	        	}
	        	else {num++;}	
	        }
	        answerArr = new int[answer.size()]; // 메소드가 int[]를 리턴하니, 어레이리스트를 인트 배열로 변환  
	        for (int i = 0; i < answerArr.length; i++) {
	        	answerArr[i] = answer.get(i);	       
	        }
	        return answerArr;       
   }   
	
	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		
		System.out.println(Arrays.toString(solution(progresses, speeds)));
	}
}
