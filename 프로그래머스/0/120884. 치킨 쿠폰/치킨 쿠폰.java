class Solution {
    public int solution(int chicken) {
        int service = 0;
        // int service = coupon / 10;
        // int coupon = chicken / 10;
        while(chicken >= 10){
            service += chicken / 10;
            chicken = (chicken / 10) + (chicken % 10);
        }
        
        return service;
    }
}

//치킨 1마리 당 쿠폰 1장
//쿠폰 10장 -> 서비스 치킨 1마리
//서비스 치킨 1마리 당 쿠폰 1장
//* 쿠폰 13장이거나 할 때 10장이 안되고 남는 쿠폰을 잘 생각해야함