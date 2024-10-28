class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        for(int i = 0; i < str1.length(); i++){
            answer += str1.charAt(i);
                for(int j = 0; j < 1; j++){
                    answer+= str2.charAt(i);
                }
        }
        
        return answer;
    }
}