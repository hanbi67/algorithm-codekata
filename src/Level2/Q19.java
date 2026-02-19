package Level2;
// 정수 제곱근 판별
public class Q19 {
    public long solution(long n) {
        long answer = 0;
        double x = Math.sqrt(n);
        if(x == (int)x){
            answer = (long)Math.pow(x+1, 2);
        } else {
            answer = -1;
        }

        return answer;
    }
}
