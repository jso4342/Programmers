package teamNew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;


public class ParkingFare {
	
	  public static int[] solution(int[] fees, String[] records) {
	        int[] answer = {};
	        int inTime = 0;
	        int outTime = 0;
	        int finalTime = 23*60 + 59;
	        int key = 0;
	        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); //현재 주차장에 있는 차 
	        TreeMap<Integer, Integer> map2 = new TreeMap<Integer, Integer>(); // 누적 시간을 담기 - 오름차순 정렬 	      
	        ArrayList<Integer> fee = new ArrayList<>();
	        
	        for (int i = 0; i < records.length; i++) {
	        	String[] temp = records[i].split(" "); // {"05:34", "5961", "IN"} 형식으로 저장 
	        	String[] time = temp[0].split(":"); // 시간을 : 를 기준으로 시 , 분으로 나눠줌 
	        	key = Integer.parseInt(temp[1]);
	        	
	        	if (temp[2].charAt(0) == 'I') { //IN 이면 
	        		inTime = Integer.parseInt(time[0]) *60 + Integer.parseInt(time[1]); // 전체 분으로 환산 후 저장 	
	        		map.put(key, inTime); // 맵에 넣어줌 
	        	} else {
	        		outTime = Integer.parseInt(time[0]) *60 + Integer.parseInt(time[1]); // 전체 분으로 환산 
	        		if (map2.containsKey(key)) { // 해당 키가 이미 map2 에 존재한다면 
	        			map2.put(key, map2.get(key) + outTime - map.get(key)); // 기존 값에 더해줌 
	        		}else {map2.put(key, outTime - map.get(key));} // map2 에 담아줌 
	        		map.remove(key); } // 지워줌 	
	        }
	        if (map != null && !map.isEmpty()) { //출차되지 않은 차가 있다면
	        	Iterator<Integer> iterator = map.keySet().iterator();
	            while(iterator.hasNext()) { // 전체 맵 체크 
	                int mapKey = iterator.next();
	                if (map2.containsKey(mapKey)) { // 이미 존재한다면 
	        			map2.put(mapKey, map2.get(mapKey) + finalTime - map.get(mapKey)); // 기존 값에 더해줌 
	        		}else { map2.put(mapKey, finalTime - map.get(mapKey));} // map2 에 담아줌	                
	            }
	        }
	   
	        Iterator<Integer> iter = map2.keySet().iterator(); 
    		while(iter.hasNext()) {
    			answer = new int[map2.keySet().size()]; // answer 에 map2 의 키 갯수만큼 칸 생성 
    			int value = map2.get(iter.next());
    			int sum = (int) (fees[1]+Math.ceil((float)(value - fees[0])/fees[2])*fees[3]); // 올림 
    				if (value - fees[0] <= 0 ? fee.add(fees[1]) : fee.add(sum));}
    		answer = fee.stream().mapToInt(i -> i).toArray();
	        return answer;
	    }
	  
	  public static void main(String[] args) {
		 int[] fees = {1, 10, 1, 11};
		 				// 기본 시간, 기본 요금, 단위 시간, 단위 요금 (분) 
		 String[] records = {"00:00 1234 IN", "00:02 1234 OUT"};
		// String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
		// String[] records = {"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"};
		 System.out.println(Arrays.toString(solution(fees, records)));
	  }
}
