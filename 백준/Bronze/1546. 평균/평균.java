import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 모든 점수를  점수/최대점수*100으로 수정
        // 이런 식으로 햇을 때 평균을 구해라
        int[] arr = new int[n];
        int max = 0;
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(arr[i], max);
        }
        for (int i = 0; i < n; i++) {
            sum += arr[i]/(double)max*100;
        }
        System.out.println(sum/n);
    }
}
