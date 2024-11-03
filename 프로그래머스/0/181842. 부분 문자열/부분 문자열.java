class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        for(int i = 0; i < str2.length(); i++){
            if(str2.contains(str1))
               answer = 1;
        }
        
        return answer;
    }
}