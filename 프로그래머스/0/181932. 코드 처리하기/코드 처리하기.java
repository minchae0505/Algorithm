class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        int i = 0;
        char now = 0;
        
        for( i = 0; i < code.length(); i++){
            now = code.charAt(i);
            
            if (mode == 0){
	            if (now != '1'){
		            if (i % 2 == 0){
                        answer += String.valueOf(now);
		            }
	            }
                else mode = 1;
            }
            
            else if (mode == 1){
	            if (now != '1'){
		            if (i % 2 == 1){
			            answer += String.valueOf(now);
		            }
	            }
	            else mode = 0;
            }

        }
        
        if(answer.isEmpty()){
            return "EMPTY";
        }
        return answer; 
    }  
}