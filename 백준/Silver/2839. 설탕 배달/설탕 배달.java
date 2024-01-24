import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int balance = Integer.parseInt(br.readLine());
        int coin = 0;

        while (0 < balance) {
            if (balance % 5 == 0) {
                coin += balance / 5;
                break;
            }
            balance -= 3;
            ++coin;
            if (balance < 0) {
                coin = -1;
                break;
            }
        }

        bw.write(String.valueOf(coin));
        bw.flush();
    }
}