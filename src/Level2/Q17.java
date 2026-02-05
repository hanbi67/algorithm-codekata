package Level2;

public class Q17 {
    public long[] solution(long n) {
        String num = Long.toString(n);
        long[] answer = new long[num.length()];

        for(int i=0; i<num.length(); i++){
            answer[i] = n % 10;
            n = n / 10;
        }

        return answer;
    }
}
