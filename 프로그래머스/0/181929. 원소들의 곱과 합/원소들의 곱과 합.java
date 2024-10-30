class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int by = 1;
        int add = 0;
        
        for(int i = 0; i < num_list.length; i++){
            by *= num_list[i];
            add += num_list[i];
        }
        add = add * add;
        answer = by > add ? 0 : 1;
        
        return answer;
    }
}