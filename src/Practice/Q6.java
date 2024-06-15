package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6 {
    public static void main(String[] args) throws IOException {

        System.out.print("당신의 나이는 몇 살입니까? ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int age = Integer.parseInt(st.nextToken());

        System.out.printf("당신의 나이는 %d살이군요.",age);
    }
}
