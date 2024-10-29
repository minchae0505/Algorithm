// class Solution {
//     public int solution(int a, int b) {
        
//         String num1 = Integer.toString(a) + Integer.toString(b);
//         String num2 = Integer.toString(a) + Integer.toString(b);
        
//         int answer1 = Integer.parseInt(num1);
//         int answer2 = Integer.parseInt(num2);
        
//         if(answer1 >= answer2)
//             return answer1;
       
//         else
//             return answer2;
//     }
// }

class Solution {
    public int solution(int a, int b) {
        int answer1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int answer2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        
        if(answer1 > answer2) {
            return answer1;
        } else {
            return answer2;
        }
    }
}

// //1. 문자열로 만들기
// //2. 더하기
// //3. 문자열을 정수로 변환하기