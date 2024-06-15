package SelfAssessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        boolean isNum1Greater = num1 > num2;
        boolean num1Check = 1 <= num1 && num1 <= 500;
        boolean num2Check = 1 <= num2 && num2 <= 500;

        if (isNum1Greater && num1Check && num2Check) {
            int mul = num1 * num2;
            int div = num1 / num2;

            System.out.printf("%d * %d = %d\n", num1, num2, mul);
            System.out.printf("%d / %d = %d", num1, num2, div);
        }
    }
}

