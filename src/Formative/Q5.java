package Formative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("yard? ");
        double input = Double.parseDouble(br.readLine());
        double yard = 91.44;

        double result = input * yard;

        System.out.printf("%.1fyard = %.1fcm", input, result);
    }
}
