import java.util.Arrays;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        while(check(wallet, bill)){
            cal(wallet, bill);
            answer++;
        }

        return answer;
    }

    private void cal (int[] wallet, int[] bill) {
        if(bill[0] > bill[1]){
            bill[0] = bill[0]/2;
        }else {
            bill[1] = bill[1]/2;
        }
    }

    private boolean check(int[] wallet, int[] bill) {
        Arrays.sort(wallet);
        Arrays.sort(bill);

        return wallet[0] < bill[0] || wallet[1] < bill[1];
    }
}