package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        System.out.print("키를 입력하세요. ");
        st = new StringTokenizer(br.readLine());
        int height = Integer.parseInt(st.nextToken());

        System.out.printf("몸무게를 입력하세요. ");
        st = new StringTokenizer(br.readLine());
        double weight = Double.parseDouble(st.nextToken());

        System.out.print("이름을 입력하세요. ");
        st = new StringTokenizer(br.readLine());
        String name = st.nextToken();

        System.out.printf("키 = %d\n", height);
        System.out.printf("몸무게 = %.1f\n", weight);
        System.out.printf("이름 = %s", name);
    }
}
