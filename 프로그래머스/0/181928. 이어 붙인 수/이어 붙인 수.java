class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                even += Integer.toString(num_list[i]);
            }
            else if(num_list[i] % 2 == 1){
                odd += Integer.toString(num_list[i]);
            }
        }
        
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        
        return answer;
    }
}


// 1. 홀수 짝수 구분한 것 문자열로 변환
// 2. 다시 정수형으로 변환
// 3. 홀수 + 짝수