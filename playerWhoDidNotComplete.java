package teamNew;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 * 
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 
완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 

완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.
 * */

public class playerWhoDidNotComplete {



	  public static String solution(String[] participant, String[] completion) {
	        String answer = "";
	        HashMap<String, Integer> map = new HashMap<String, Integer>();
	        // 참가자들을 담을 map 을 만듦 
	        
	      for (String participate : participant) {
	    	  map.put(participate, map.getOrDefault(participate, 0) + 1);
	      } //map 에 participant 들을 다 넣어준다 (기본 value 값은 0으로) 
	     for (String participate : completion) {
	    	 map.put(participate, map.get(participate) - 1);
	     }	// 완주 했으면 value 를 1로 변경
	    
	     for (String participate : map.keySet()) {
	            if (map.get(participate).equals(1)) {
	                return participate;
	                //밸류 값이 1인 participate(Key) 찾기 
	            }
	        }
	       
	    return answer;
	    }
	  
	  
	  public static void main(String[] args) {
		  String[] participant = {"mislav", "stanko", "mislav", "ana"};
		  String[] completion = {"mislav", "stanko", "ana"};
		  
		  System.out.println(solution(participant, completion));
		
	}
	
}
