package Practice;

public class Q4 {
    public static void main(String[] args) {
        int radius = 5;
        int diameterMultiplier = 2;
        double pi = 3.140000;
        double circumference = radius * diameterMultiplier * pi;
        double area = radius * radius * pi;

        System.out.printf("원주 = %d * %d * %f = %6f\n", radius, diameterMultiplier, pi, circumference);
        System.out.printf("넓이 = %d * %d * %f = %6f", radius, radius, pi, area);
    }
}
