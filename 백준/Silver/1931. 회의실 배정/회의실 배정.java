import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            list.add(new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }

        list.sort((o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        ArrayList<int[]> list2 = new ArrayList<>();
        list2.add(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            int index = list2.size() - 1;
            if (list2.get(index)[1] <= list.get(i)[0]) {
                list2.add(list.get(i));
            }
        }
        int size = list2.size();
        bw.write(String.valueOf(size));
        bw.flush();

    }
}