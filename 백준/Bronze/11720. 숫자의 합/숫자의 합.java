import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        String str = br.readLine();
        for (int i = 0; i < n; i++) { // 54321
            sum += str.charAt(i) - '0'; // 문자 5가 숫자 5로 나오게 하려면 문자 5보다 작은 값인 문자 0을 빼기
        }
        System.out.println(sum);
    }
}
