package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7 {
    public static void main(String[] args) throws IOException {

        System.out.print("두 수를 입력하시오. ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int sum = num1 + num2;
        int mul = num1 * num2;

        System.out.printf("%d + %d = %d\n", num1, num2, sum);
        System.out.printf("%d * %d = %d", num1, num2, mul);
    }
}
