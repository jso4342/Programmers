class Solution {
 public int romanToInt(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            switch (c) {
            case 'I': answer += 1;
                     break;
            case 'V': answer += 5;
            if (i != 0 && (s.charAt(i - 1) == 'I')){answer -= 2;}
                     break;
            case 'X': answer += 10;
            if (i != 0 && (s.charAt(i - 1) == 'I')){answer -= 2;}
                     break;
            case 'L': answer += 50;
            if (i != 0 && (s.charAt(i - 1) == 'X')){answer -= 20;}
                     break;
            case 'C': answer += 100;
            if (i != 0 && (s.charAt(i - 1) == 'X')){answer -= 20;}
                     break;
            case 'D': answer += 500;
            if (i != 0 && (s.charAt(i - 1) == 'C')){answer -= 200;}
                     break;
            case 'M': answer += 1000;
            if (i != 0 && (s.charAt(i - 1) == 'C')){answer -= 200;}
                     break;
            }
        }
        return answer;
    }
}
