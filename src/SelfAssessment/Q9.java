package SelfAssessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double num1 = Double.parseDouble(br.readLine());
        double num2 = Double.parseDouble(br.readLine());
        double num3 = Double.parseDouble(br.readLine());

        System.out.printf("%.3f\n", num1);
        System.out.printf("%.3f\n", num2);
        System.out.printf("%.3f", num3);
    }
}
