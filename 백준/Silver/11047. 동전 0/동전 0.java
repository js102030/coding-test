import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] coins = new int[n];
        for (int i = 0; i < coins.length; i++) {
            int coin = Integer.parseInt(br.readLine());
            coins[i] = coin;
        }

        int balance = k;
        int coinCount = 0;
        for (int i = coins.length - 1; 0 <= i; i--) {
            if (coins[i] <= balance) {
                balance = balance - coins[i++];
                ++coinCount;
            }
        }
        bw.write(coinCount + "");
        bw.flush();
    }
}