import java.util.Stack;

public class CorrectBraket {


	    static boolean solution(String s) {
	    	  boolean answer = true;
	          Stack<Character> stack = new Stack<>();
	          
	          for (int i = 0; i < s.length(); i++) {
	             char cha = s.charAt(i);
	             
	             if (cha == ')') {
	                if (stack.isEmpty()) {
	                   return false;
	                }
	                stack.pop();
	             } else {
	                stack.push('(');
	                
	                   return true;
	             }
	          }
	       answer = stack.isEmpty() ? true : false;
	       return answer ;

	                

	    	/*
	        boolean answer = true;
	        Stack<Character> stack = new Stack<Character>();

	        for(int i=0; i<s.length(); i++){
	                if(s.charAt(i) == '(')  // 현재 (가 들어갈 자리면 스택에 넣는다.
	                    stack.push('(');
	                else{
	                    if(stack.isEmpty()) // 현재 )가 들어갈 자리인데 스택이 비어있을경우 -> false
	                        return false;
	                    else
	                        stack.pop();    // 현재 )가 들어갈 상태에서 스택에 괄호('(')가 있는경우 -> pop
	                }
	        }
	        answer = (stack.isEmpty()) ? true : false;
	        return answer;
*/
	    	/*
	        int length = s.length() -1;
	        int count = 0;
	        if (s.charAt(0) == ')' || s.charAt(length) == '(') {return false;}
	        for (int i = 0; i < s.length(); i++) {
	        	if (s.charAt(i) == '(') {
	        		count++; // ( 을 찾으면 카운트 +
	        	}
	        	if (s.charAt(i) == ')') {
	        		count--; // ) 을 찾으면 카운트 - 
	        	}
	        	if (count < 0) {return false;} // 괄호 닫힘이 괄호 열림보다 먼저 나옴 
	        }
	        if (count == 0){return true;}
	        return false;
	        */
	    }
	    
	public static void main(String[] args) {
		String s = "())()(()";
		
		System.out.println(solution(s));
	}
}
