import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        // 2개 재료의 고유번호를 합쳐서 m이되면 갑옷이 만들어진다
        // 재료 개수 n
        // m
        // 1 2 3 4 5 7
        // 1+7이 m보다 작을 때 sta 오른쪽이동
        // 2+7이 m과 같을 떄  cnt++, end 왼쪽이동
        // 2+5이 m보다 작을 때 sta 오른쪽이동
        // 3+5가 m보다 작을 떄 sta 오른쪽 이동
        // 4+5가 m과 같을 떄 cnt++ end 왼쪽이동
        // 4,4 sta == end일 떄 whoel 종료
        // 1 2 3 4 5 (3)
        int cnt = 0;
        int sta = 0; // 시작
        int end = n-1; // 끝
        int sum = arr[sta] + arr[end]; // 배열 첫요소가 처음 구간 합
        while (sta!=end) {
            if(m == sum) {
                cnt++;
                sum-=arr[end];
                end--;
                sum+=arr[end];
            } else if (sum < m) {
                sum-=arr[sta];
                sta++;
                sum+=arr[sta];
            } else {
                sum-=arr[end];
                end--;
                sum+=arr[end];
            }
        }
        System.out.println(cnt);
     }
}