class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char word = 0;
        
        for(int i = 0; i < n; i++){
            word = my_string.charAt(i);
            answer += String.valueOf(word);
        }
        
        return answer;
    }
}