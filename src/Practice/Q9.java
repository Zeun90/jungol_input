package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("두 개의 실수를 입력하시오.");
        double x = Double.parseDouble(br.readLine());
        double y = Double.parseDouble(br.readLine());

        System.out.printf("x = %.2f\n", x);
        System.out.printf("y = %.2f", y);
    }
}
