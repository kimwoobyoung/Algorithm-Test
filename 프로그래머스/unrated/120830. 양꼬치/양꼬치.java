class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int service = 0;
        answer = ((n * 12000) + (2000* k));
        service = (n / 10) * 2000;
        
        return answer - service;
    }
}