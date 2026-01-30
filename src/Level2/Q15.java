package Level2;

public class Q15 {
// 나머지가 1이 되는 수 찾기
    public int solution(int n) {
        int answer = 0;

        for(int x = 2; x <= n; x++){
            if(n % x == 1 ){
                answer = x;
                break;
            }
        }
        return answer;
    }

}
