import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        int sta = 1;
        int end = 1;
        int sum = 1;
        while (end != n) {
            if (sum == n) {
                cnt++;
                end++;
                sum += end;
            } else if (sum > n) {
                sum -= sta; 
                sta++;
            } else {
                end++;
                sum += end;
            }
        }
        System.out.println(cnt);
    }
}