package SelfAssessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double num1 = Double.parseDouble(br.readLine());
        double num2 = Double.parseDouble(br.readLine());
        String str = br.readLine();

        char ch = str.charAt(0);

        System.out.printf("%.2f\n%.2f\n%c", num1, num2, ch);
    }
}
