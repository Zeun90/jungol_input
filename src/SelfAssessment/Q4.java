package SelfAssessment;

public class Q4 {
    public static void main(String[] args) {
        int weight = 49;
        double gravityRatio = 0.2683;
        double force = weight * gravityRatio;

        System.out.printf("%d * %6f = %6f", weight, gravityRatio, force);
    }
}
